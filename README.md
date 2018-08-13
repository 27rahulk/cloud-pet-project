# cloud-pet-project
Complete sample project with spring cloud using cloud config, eureka, zuul, feign, hystrix and turbine

## A sample ready to use project with all basic configuration for -
    1.    Spring cloud config (taking out and putting all the properties file at the same location)
    2.    Eureka discovery enabled to maintain scaled up instances
    3.    API gateways with zuul to support routing to different microservice
    4.    Use of feign client to call different micro service wherever necessary
    5.    fallback support for feign
    6.    hystrix dashboard with turbine to get metrics

## How to start

  ### Config server
  
  To start the project, first start config server, It is set up to be used in native mode, which menas it will search for the properties file specifically in local folder.
  
  - Either you copy all the properties files from https://github.com/27rahulk/cloud-pet-project/tree/master/pet_profiles_config to the specified folder as shown in the pet-config application.properties path `spring.cloud.config.server.native.search-locations`. It's configured to fetch from window location from Desktop, it can be modified at specific location.
  - Other way is by using a git location as commented out in application.properties file of pet-config
  
  `cd pet-config/`
  
  `mvn spring-boot:run`
 
  ### Eureka server
  
  `cd pet-eureka/`
  
  `mvn spring-boot:run`
  
  move to http://localhost:8761 to keep a track of registered server
  
  ### Cat service
  
  `cd cat-service/`
  
  `mvn spring-boot:run`
  
  ### Dog service
  
  `cd dog-service/`
  
  `mvn spring-boot:run`
  
  ### Pet food
  
  `cd pet-food/`
  
  `mvn spring-boot:run`
  
  ### Pet API
  
  `cd pet-api/`
  
  `mvn spring-boot:run`
  
  ### Pet Dashboard
  
  `cd pet-dashboard/`
  
  `mvn spring-boot:run`
  
 ## Flow
 
        UI/web --> pet-api --zuul--> cat and dog --feign--> pet-food
			|_____________|_______|________________|
					   |
					pet-eureka	
  ### Zuul
  
   API gateway is the interface for web servers or browser. API gateway is running on 8080 and through API gateway all other services can be called.
   
   API gateway uses zuul (`@EnableZuulProxy`) to route the calls to designated microserver
   
   for example :
     GET http://localhost:8080/app/cat/sound gets routed to GET http://localhost:8070/cat/sound
      
     hitting the API GET http://localhost:8080/app/cat/sound will give us "meooow!" response
      
     similarly hitting API GET http://localhost:8080/app/dog/sound will be routed to dog service and will return "woof!"
    
  ### Feign
  
   Another caveat is when one micro service need to call to other micro service, it will use feign client (`@EnableFeignClient`). It can be demonstrated as when we call the api gateway to get cat food it routes the call to cat service which in turns makes a call to pet-food service to get cat food information.
   
   GET http://localhost:8080/app/cat/food gets routed to GET http://localhost:8070/cat/food which makes a call to pet-food API http://localhost:8011/food/cat to get the information
   
  ### Circuit breaker and fallback
  
   If for some reason pet-food APIs are unavailable or it cannot be reached, we can configure a fallback implementation by providing `@EnableCircuitBreaker` and `feign.hystrix.enabled=true`
   
   To test it, we can take down the pet-food service and try to make the call to http://localhost:8080/app/cat/food, it should show me the below message
   
      food details is not available for cats at the moment! try again later.
  
  ### Hystrix dashboard with turbine
  
   We can keep a track of calls made by routing and circuit breaks by the means of hystrix dashboard, for that reason we would enable turbine (`@EnableTurbine`) in pet-dashboard running in localhost://8087 and `@EnableHystrix` in target services
      
   To get the dashboard (`@EanbleHystrixDashboard`) make a call to http://localhost:8087/hystrix/
      
   You should see the dashboard, in the stream put the value http://localhost:8087/turbine.stream and submit that, it should start monitoring and you should watch different services wuth chart and it should show the real time data when you try to make api calls of cat and dog.

   A particular service metrics can be fetched by the call to the service for ex. - http://localhost:8080/actuator/hystrix.stream 

 ## APIs

     GET  /app/cat/sound
     GET  /app/cat/food
     GET  /app/dog/sound
     GET  /app/dog/food
 
 [more info](https://medium.com/@27.rahul.k/build-a-sample-project-with-spring-cloud-using-cloud-config-eureka-zuul-feign-hystrix-and-378b16bcb7c3)
