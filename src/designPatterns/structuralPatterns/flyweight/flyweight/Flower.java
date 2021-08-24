package designPatterns.structuralPatterns.flyweight.flyweight;

public class Flower {

	private FlowerColor flowerColor;
	private static int instanceCounter = 0;
	
	public Flower(FlowerColor flowerColor) {
		this.flowerColor = flowerColor;
		++instanceCounter;
	}
	
	public FlowerColor getFlowerColor() {
		return flowerColor;
	}
	
	public static int getInstanceCount() {
		return instanceCounter;
	}
	
	public static void resetCounter() {
		instanceCounter = 0;
	}
	
}
