package designPatterns.creationalPatterns.builder.builder;

public class CoffeeRecipeBuilder implements ICoffeeBuilder {
	
	private CoffeeRecipe coffeeRecipeResult = null;

	@Override
	public void addBoiledWater() {
		coffeeRecipeResult.setDrinkable(true);
	}

	@Override
	public void addCoffee() {
		coffeeRecipeResult.setWithCoffee(true);
	}

	@Override
	public void addSugar() {
		coffeeRecipeResult.setSweet(true);
	}

	@Override
	public void addMilk(MilkKind milkKind) {
		coffeeRecipeResult.setWithMilk(true);
		coffeeRecipeResult.setMilkKind(milkKind);
	}

	@Override
	public void addWhippedCream() {
		coffeeRecipeResult.setWithWhippedCream(true);
	}

	@Override
	public void addWhiskey(String whiskeyKind) {
		coffeeRecipeResult.setWithWhiskey(true);
	}

	@Override
	public void reset() {
		coffeeRecipeResult = new CoffeeRecipe();
	}

	@Override
	public Object build() {
		return coffeeRecipeResult;
	}

}
