package designPatterns.creationalPatterns.builder.builder;

public class CoffeeBuilder implements ICoffeeBuilder {
	
	private Coffee coffeeResult = null;

	@Override
	public void addBoiledWater() {
		coffeeResult.setDrinkable(true);
	}

	@Override
	public void addCoffee() {
		coffeeResult.setWithCoffee(true);
	}

	@Override
	public void addSugar() {
		coffeeResult.setSweet(true);
	}

	@Override
	public void addMilk(MilkKind milkKind) {
		coffeeResult.setWithMilk(true);
		coffeeResult.setMilkKind(milkKind);
	}

	@Override
	public void addWhippedCream() {
		coffeeResult.setWithWhippedCream(true);
	}

	@Override
	public void addWhiskey(String whiskeyKind) {
		coffeeResult.setWithWhiskey(true);
	}

	@Override
	public void reset() {
		coffeeResult = new Coffee();
	}

	@Override
	public Object build() {
		return coffeeResult;
	}

}
