package designPatterns.creationalPatterns.builder;

import designPatterns.creationalPatterns.builder.builder.Coffee;
import designPatterns.creationalPatterns.builder.builder.CoffeeDirector;

/**
 * 
 * @author ForgotMyCode
 * @implSpec Use step-by-step approach to avoid complicated constructors.
 * 
 */
public class Main {

	public static void main(String[] args) {
		final CoffeeDirector coffeeDirector = new CoffeeDirector();
		
		final Coffee sweetCoffee = coffeeDirector.makeSweetCoffee();		
		System.out.println(sweetCoffee);
		
		final Coffee irishCoffee = coffeeDirector.makeIrishCoffee();
		System.out.println(irishCoffee);
	}

}
