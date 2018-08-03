/**
 * 
 */
package com.pet.dog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pet.dog.feign.FoodService;

/**
 * @author Rahul Kumar
 *
 */
@Service
public class DogService {
	
	@Autowired
	private FoodService foodService;
	
	public String getFood() {
		return foodService.getFood("dog");
	}
}
