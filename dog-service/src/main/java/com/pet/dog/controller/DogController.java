/**
 * 
 */
package com.pet.dog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pet.dog.service.DogService;

/**
 * @author Rahul Kumar
 *
 */
@RestController
public class DogController {
	
	@Autowired
	private DogService dogService;
	
	@GetMapping(path="/dog/sound")
	public String makeSound() {
		return "woof!";
	}
	
	@GetMapping(path="/dog/food")
	public String getFoodDetails() {
		return dogService.getFood();
	}
}
