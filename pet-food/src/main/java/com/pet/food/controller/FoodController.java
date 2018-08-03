/**
 * 
 */
package com.pet.food.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pet.food.service.FoodService;

/**
 * @author Rahul Kumar
 *
 */
@RestController
public class FoodController {
	
	@Autowired
	private FoodService foodService;
	
	@GetMapping(path="/food/pet/{type}")
	public String getFood(@PathVariable("type") String petType) {
		return foodService.getFoodDetail(petType);
	}

}
