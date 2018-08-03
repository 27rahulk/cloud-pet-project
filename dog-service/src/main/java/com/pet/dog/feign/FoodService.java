/**
 * 
 */
package com.pet.dog.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Rahul Kumar
 *
 */
@FeignClient(value="pet-food", fallback=FoodFallbackService.class)
public interface FoodService {
	
	@GetMapping(path="/food/pet/{type}")
	public String getFood(@PathVariable("type") String petType);
	
}
