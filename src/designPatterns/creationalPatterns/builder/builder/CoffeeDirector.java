package designPatterns.creationalPatterns.builder.builder;

public class CoffeeDirector {
	
	private ICoffeeBuilder builder = null;
	
	public void setBuilder(ICoffeeBuilder coffeeBuilder) {
		this.builder = coffeeBuilder;
	}
	
	public Object makeSweetCoffee() {
		return makeSweetCoffee(builder);
	}
	
	public Object makeSweetCoffee(ICoffeeBuilder builder) {
		builder.reset();
		builder.addBoiledWater();
		builder.addCoffee();
		builder.addSugar();
		builder.addMilk(MilkKind.Normal);
		return builder.build();
	}
	
	public Object makeIrishCoffee() {
		return makeIrishCoffee(builder);
	}
	
	public Object makeIrishCoffee(ICoffeeBuilder builder) {
		builder.reset();
		builder.addBoiledWater();
		builder.addCoffee();
		builder.addSugar();
		builder.addWhiskey("Irish");
		builder.addWhippedCream();
		return builder.build();
	}
	
}
