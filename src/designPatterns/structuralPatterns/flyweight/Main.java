package designPatterns.structuralPatterns.flyweight;

import java.util.ArrayList;
import java.util.List;

import designPatterns.structuralPatterns.flyweight.flyweight.Flower;
import designPatterns.structuralPatterns.flyweight.flyweight.FlowerColor;
import designPatterns.structuralPatterns.flyweight.flyweight.FlowerFactory;

/**
 * 
 * @author ForgotMyCode
 * @implSpec Reduces creation of reusable objects, basically a factory that returns the same instance.
 *
 */
public class Main {

	public static void main(String[] args) {
		// --- WITHOUT FLYWEIGHT --- //
		
		System.out.println("Approach without flyweight...");
		
		Flower.resetCounter();
		
		List<Flower> flowerCollection1 = new ArrayList<>();
		
		System.out.println("Planting 100 red flowers...");
		
		for(int i = 0; i < 100; ++i) {
			flowerCollection1.add(new Flower(FlowerColor.RED));
		}
		
		System.out.println("Planting 100 blue flowers...");
		
		for(int i = 0; i < 100; ++i) {
			flowerCollection1.add(new Flower(FlowerColor.BLUE));
		}
		
		System.out.println("Planting 100 yellow flowers...");
		
		for(int i = 0; i < 100; ++i) {
			flowerCollection1.add(new Flower(FlowerColor.YELLOW));			
		}
		
		System.out.println("Created " + Flower.getInstanceCount() + " flower instances.");
		
		System.out.println();
		
		// --- USING FLYWEIGHT --- //
		
		System.out.println("Approach using flyweight...");
		
		Flower.resetCounter();
		
		List<Flower> flowerCollection2 = new ArrayList<>();
		
		System.out.println("Planting 100 red flowers...");
		
		for(int i = 0; i < 100; ++i) {
			flowerCollection2.add(FlowerFactory.getFlower(FlowerColor.RED));
		}
		
		System.out.println("Planting 100 blue flowers...");
		
		for(int i = 0; i < 100; ++i) {
			flowerCollection2.add(FlowerFactory.getFlower(FlowerColor.BLUE));
		}
		
		System.out.println("Planting 100 yellow flowers...");
		
		for(int i = 0; i < 100; ++i) {
			flowerCollection2.add(FlowerFactory.getFlower(FlowerColor.YELLOW));		
		}
		
		System.out.println("Created " + Flower.getInstanceCount() + " flower instances.");
	}

}
