package designPatterns.creationalPatterns.builder.builder;

public interface ICoffeeBuilder {
	
	public void reset();
	
	public Object build();

	public void addBoiledWater();
	
	public void addCoffee();
	
	public void addSugar();
	
	public void addMilk(MilkKind milkKind);
	
	public void addWhippedCream();
	
	public void addWhiskey(String whiskeyKind);
	
}
