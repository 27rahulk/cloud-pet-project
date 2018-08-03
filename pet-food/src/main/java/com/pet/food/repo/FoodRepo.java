/**
 * 
 */
package com.pet.food.repo;

import java.util.HashMap;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

/**
 * @author Rahul Kumar
 *
 */
@Component
public class FoodRepo {
	
	private HashMap<String, String> foodInfoStore = new HashMap<>();
	
	@PostConstruct
	public void init() {
		synchronized (foodInfoStore) {
			foodInfoStore.clear();
			foodInfoStore.put("dog", dog_food);
			foodInfoStore.put("cat", cat_food);
		}
	}
	
	public String getFoodForPet(String petType) {
		return foodInfoStore.get(petType);
	}
	
	
	
	public static final String cat_food = "Cats are obligate or true carnivores, meaning that they need a source of animal protein to survive. In the wild, cats eat the carcases of the prey animals they catch which consist of raw meat, raw bones, organs, other tissue and digested vegetable matter. While cats are carnivores they do consume a small amount of the vegetable matter contained in the stomach and intestines of their prey. Cats have adapted over thousands of years to eat this type of diet.\r\n" + 
			"\r\n" + 
			"Basic cat feeding guide:\r\n" + 
			"\r\n" + 
			"Talk to your veterinarian for advice\r\n" + 
			"Feed a high quality balanced premium commercial food that is appropriate for the life stage and health status of your cat. Check that it complies with the Australian Standard: Manufacturing and Marketing Pet Food: AS5812:2011\r\n" + 
			"You can offer some natural foods to provide some variety\r\n" + 
			"Natural foods include fresh raw meat (e.g. pieces of raw lamb, pieces of raw chicken) and raw meaty bones\r\n" + 
			"First check that raw bones are suitable for your particular cat with your vet (some cats with misshapen jaws or dental disease may have difficulty chewing on raw bones or older cats may have difficulty)\r\n" + 
			"Raw food offered to cats should always be fresh\r\n" + 
			"Choose human-grade raw meat and raw meaty bones because some pet meat/pet mince/pet rolls/pet meat and bone products can contain preservatives which can be detrimental to the cat's health (e.g. sulphite preservative induced thiamine deficiency which can be fatal) . However avoid sausages, sausage meat and cooked manufactured meats as they can contain sulphite preservatives.\r\n" + 
			"Provide some moist foods in the diet regularly as this has been associated with greater urinary tract health e.g. wet can food, fresh raw lamb meat\r\n" + 
			"Raw meaty bones provide several important health benefits. They help to keep teeth and gums healthy\r\n" + 
			"Suitable raw meaty bones include raw chicken necks, raw chicken wings, raw chicken drumsticks, raw lamb shanks \r\n" + 
			"Too many raw bones may lead to constipation. Generally 1-2 raw meaty bones may be provided per week with a few days in between each serving\r\n" + 
			"The bone must be large enough so that the cat cannot fit the whole bone in its mouth or swallow the bone whole\r\n" + 
			"Always supervise cats when they eat raw bones\r\n" + 
			"Avoid large marrow bones, large knuckle bones or bones sawn lengthwise as cats may crack their teeth on these\r\n" + 
			"Never feed cooked bones as these may splinter and cause internal damage or become an intestinal obstruction\r\n" + 
			"Fish, such as tinned sardines in springwater; tinned tuna and tinned salmon (care with any fish bones) can also be offered as a treat occasionally. Please avoid feeding fish constantly\r\n" + 
			"Cooked meat such as boiled chicken may also be offered occasionally, please ensure there are no cooked bones, onions/onion sauces or other toxic substances present (see below)\r\n" + 
			"Cats may also be offered a small amount of vegetable matter\r\n" + 
			"Provide cats with access to grass (avoid chemically treated grass and toxic plants) - they occasionally eat grass which may be a source of vegetable matter and micronutrients. Be aware that large amounts of certain types of 'cat grass' can cause hypervitaminosis D.\r\n" + 
			"The amount of food required will depend on your cat's size and age, but you should take care not to overfeed or underfeed. Your vet will be able to weigh your cat, assess your cat's body condition score and provide advice  \r\n" + 
			"Adult cats tend to prefer to eat several smaller meals throughout the day/night. They should ideally be offered food at least 3-4 times per day (eating smaller frequent meals has been associated with greater urinary tract health)\r\n" + 
			"Please ensure clean fresh drinking water is available at all times\r\n" + 
			"Do not feed the following (note this is not an exhaustive list ): onions, onion powder, garlic, chocolate, coffee or caffeine products, mouldy or spoiled foods or compost,bread dough, yeast dough, avocado, grapes, raisins, sultanas (including in Christmas cakes etc), currants, nuts including macadamia nuts, fruit stones (pits) e.g. mango seeds, apricot stones; fruit seeds, corncobs; tomatoes, mushrooms; fish constantly, cooked bones; small pieces of raw bone or fatty trimmings/fatty foods, salt. Also ensure your pet cat does not have access to string wrappings around rolled roasts or absorbent pads found under meat when wrapped on trays.";
	
	public static final String dog_food = "Domesticated dogs are largely carnivores that eat some omnivorous foods. Wild dogs eat a variety of food which consists mainly of prey animals. Prey animals are composed of raw meat, raw bones, organs, other tissue and digested vegetable matter. While dogs are carnivores they do consume a small amount of the vegetable matter contained in the stomach and intestines of their prey. Dogs have evolved over thousands of years to eat this type of diet.\r\n" + 
			"\r\n" + 
			"Basic dog feeding guide:\r\n" + 
			"\r\n" + 
			"The following information is general advice, but as each dog is different we recommend that you talk to your veterinarian, especially if your dog has any special dietary needs or has a reaction to a standard diet.\r\n" + 
			"\r\n" + 
			"The basis of your dog's diet should be a high quality balanced premium dog food that is appropriate for the life stage and health status of your dog. Check that it complies with the Australian Standard: Manufacturing and Marketing Pet Food AS 5812:2017. \r\n" + 
			"\r\n" + 
			"You can also offer some natural foods to provide some variety. Natural foods include fresh human-grade raw meat (e.g. raw lamb), raw meaty bones and vegetables. You should check with your vet first that raw meaty bones are suitable for your particular dog (e.g. some dogs with misshapen jaws or dental disease may find chewing on raw bones difficult or older dogs may have difficulty).\r\n" + 
			"\r\n" + 
			"We recommend you choose human-grade raw meat and raw meaty bones because some pet meat/pet mince/pet rolls/pet meat and bone products can contain preservatives that can be detrimental to the dog's health (e.g. sulphite preservative induced thiamine deficiency which can be fatal). You should avoid sausages, sausage meat and cooked manufactured meats as they can contain sulphite preservatives.\r\n" + 
			"\r\n" + 
			"The amount of food required will depend on your dog's size, breed, age and level of exercise, but take care not to overfeed or underfeed. Your vet will be able to weigh your dog, assess your dog's body condition score and provide advice.\r\n" + 
			"\r\n" + 
			"Adults dogs should be fed at least twice a day to avoid bloat, which can be fatal. You should also avoid exercising your dog immediately before or after eating, to avoid bloat, particularly deep-chested dogs.  \r\n" + 
			"\r\n" + 
			"Fresh drinking water must be available at all times.\r\n" + 
			"\r\n" + 
			"Feeding bones\r\n" + 
			"\r\n" + 
			"Raw meaty bones such as raw lamb ribs (not lamb chops though) and raw lamb flaps provide several important health benefits including keeping teeth and gums healthy. They must always be given raw (uncooked).\r\n" + 
			"\r\n" + 
			"Too many raw bones may lead to constipation. Generally 1-2 raw bones may be offered per week with a few days in between each serving. The bone must be large enough so that the dog cannot fit the whole bone in its mouth or swallow the bone whole. Avoid large marrow bones (these have very thick outer rims), T-bones, 'chop' bones e.g. lamb cutlets, large knuckle bones and bones sawn lengthwise (as done by some butchers) as dogs may crack their teeth on these.\r\n" + 
			"\r\n" + 
			"You should always supervise your dog when they are eating bones.\r\n" + 
			"\r\n" + 
			"Never feed your dog cooked bones as these can splinter and cause internal damage or become an intestinal obstruction.\r\n" + 
			"\r\n" + 
			"Dogs really like bones so they can sometimes become protective over them. Do take care and discourage young children and others from approaching dogs that are eating.\r\n" + 
			"\r\n" + 
			"Other foods\r\n" + 
			"\r\n" + 
			"Dogs may be offered fish, such as tinned sardines, tinned tuna and tinned salmon as a treat occasionally (take care with any fish bones), but fish should not be fed constantly and choose fish canned in spring water rather than oil or brine.\r\n" + 
			"\r\n" + 
			"Dogs may also be offered a small amount of cooked vegetables, e.g. pumpkin, carrots etc. Cooked meat, such as boiled chicken or lamb, may also be offered but please ensure there are no cooked bones; onions/onion sauces or other toxic substances present (see below). A small amount of plain cooked pasta or rice may also be offered.\r\n" + 
			"\r\n" + 
			"You should also make sure you dog has access to grass (avoid chemically treated grass and toxic plants) - dogs will sometimes eat grass which may provide a source of vegetable matter and micronutrients\r\n" + 
			"\r\n" + 
			"Toxic foods \r\n" + 
			"\r\n" + 
			"Do not ever feed the following substances as they are toxic to dogs (note this is not an exhaustive list): onions, onion powder, garlic, chocolate, coffee or caffeine products, mouldy or spoiled foods or compost, avocado, bread dough, yeast dough, grapes, raisins, sultanas (including in Christmas cakes etc), currants, nuts including macadamia nuts, fruit stones (pits) e.g. mango seeds, apricot stones, avocado stones; fruit seeds, corncobs; green unripe tomatoes, mushrooms; fish constantly, cooked bones; small pieces of raw bone, fatty trimmings/ fatty foods, Salt,  Xylitol (sugar substitute found in some products such as some types of sugarfree chewing gum, lollies, baking goods, toothpaste and sugarfree peanut butter).\r\n" + 
			"\r\n" + 
			"Also ensure your pet dog doesn't have access to string wrappings around rolled roasts or absorbent pads found under meat when wrapped on trays.";
}
