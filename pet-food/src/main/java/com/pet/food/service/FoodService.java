/**
 * 
 */
package com.pet.food.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pet.food.repo.FoodRepo;

/**
 * @author Rahul Kumar
 *
 */
@Service
public class FoodService {
	
	@Autowired
	private FoodRepo foodRepo;

	public String getFoodDetail(String petType) {
		return foodRepo.getFoodForPet(petType);
	}
}
