package designPatterns.creationalPatterns.builder.builder;

public class CoffeeDirector {

	public Coffee makeSweetCoffee() {
		final CoffeeBuilder coffeeBuilder = new CoffeeBuilder();
		
		final Coffee coffee = coffeeBuilder
			.addCoffee()
			.addWater()
			.addMilk()
			.addSugar()
			.build();
		
		return coffee;			
	}
	
	public Coffee makeIrishCoffee() {
		final CoffeeBuilder coffeeBuilder = new CoffeeBuilder();
		
		final Coffee coffee = coffeeBuilder
			.addCoffee()
			.addWater()
			.addWhiskey()
			.addWhippedCream()
			.build();
		
		return coffee;
		
	}
}
