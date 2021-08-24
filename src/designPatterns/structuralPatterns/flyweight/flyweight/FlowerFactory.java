package designPatterns.structuralPatterns.flyweight.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlowerFactory {

	private static Map<FlowerColor, Flower> flowerStorage = new HashMap<>();
	
	public static Flower getFlower(FlowerColor flowerColor) {
		if(flowerStorage.containsKey(flowerColor)) {
			return flowerStorage.get(flowerColor);
		}
		// else: no flower of given color in the storage
		final Flower flower = new Flower(flowerColor);
		flowerStorage.put(flowerColor, flower);
		
		return flower;
	}
	
}
