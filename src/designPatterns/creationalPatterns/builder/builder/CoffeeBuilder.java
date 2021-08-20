package designPatterns.creationalPatterns.builder.builder;

public class CoffeeBuilder {

	private Coffee coffee = null;
	
	public CoffeeBuilder reset() {
		coffee = new Coffee();
		return this;
	}
	
	public CoffeeBuilder addWater() {
		coffee.setDrinkable(true);
		return this;
	}
	
	public CoffeeBuilder addMilk() {
		coffee.setWithMilk(true);
		return this;
	}
	
	public CoffeeBuilder addSugar() {
		coffee.setSweet(true);
		return this;
	}
	
	public CoffeeBuilder addCoffee() {
		coffee.setWithCoffee(true);
		return this;
	}
	
	public CoffeeBuilder addWhiskey() {
		coffee.setWithWhiskey(true);
		return this;
	}
	
	public CoffeeBuilder addWhippedCream() {
		coffee.setWithWhippedCream(true);
		return this;
	}
	
	public Coffee build() {
		return coffee;
	}
}
