package designPatterns.creationalPatterns.builder;

import designPatterns.creationalPatterns.builder.builder.Coffee;
import designPatterns.creationalPatterns.builder.builder.CoffeeBuilder;
import designPatterns.creationalPatterns.builder.builder.CoffeeDirector;
import designPatterns.creationalPatterns.builder.builder.CoffeeRecipe;
import designPatterns.creationalPatterns.builder.builder.CoffeeRecipeBuilder;

/**
 * 
 * @author ForgotMyCode
 * @implSpec Use step-by-step approach to avoid complicated constructors.
 * 
 */
public class Main {

	public static void main(String[] args) {
		final CoffeeBuilder coffeeBuilder = new CoffeeBuilder();
		final CoffeeRecipeBuilder coffeeRecipeBuilder = new CoffeeRecipeBuilder();
		final CoffeeDirector coffeeDirector = new CoffeeDirector();
		
		coffeeDirector.setBuilder(coffeeBuilder);
		
		Coffee sweetCoffee = (Coffee) coffeeDirector.makeSweetCoffee();
		System.out.println(sweetCoffee);
		
		CoffeeRecipe irishCoffeeRecipe = (CoffeeRecipe) coffeeDirector.makeIrishCoffee(coffeeRecipeBuilder);
		System.out.println(irishCoffeeRecipe);
	}

}
