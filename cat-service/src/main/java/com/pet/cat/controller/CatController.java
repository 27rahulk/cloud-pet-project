/**
 * 
 */
package com.pet.cat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pet.cat.service.CatService;

/**
 * @author Rahul Kumar
 *
 */
@RestController
public class CatController {
	
	@Autowired
	private CatService catService;

	@GetMapping(path="/cat/sound")
	public String makeSound() {
		return "meooow!";
	}
	
	@GetMapping(path="/cat/food")
	public String getFoodDetails() {
		return catService.getFood();
	}
}
