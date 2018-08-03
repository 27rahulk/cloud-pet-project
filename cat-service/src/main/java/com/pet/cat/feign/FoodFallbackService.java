/**
 * 
 */
package com.pet.cat.feign;

import org.springframework.stereotype.Component;

/**
 * @author Rahul Kumar
 *
 */
@Component
public class FoodFallbackService implements FoodService {

	@Override
	public String getFood(String petType) {
		return "food details is not available for cats at the moment! try again later.";
	}

}
