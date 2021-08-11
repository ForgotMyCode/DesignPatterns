package designPatterns.creationalPatterns.prototype;

import designPatterns.creationalPatterns.prototype.prototype.Vector;
import designPatterns.creationalPatterns.prototype.prototype.Vector4;

/**
 * 
 * @author ForgotMyCode
 * @implSpec Provides clone method and prototype constructors.
 * The constructors get reference to the object being cloned and copy their current state,
 * also call {@code super} with the same argument, doing the same thing.
 *
 */
public class Main {

	public static void main(String[] args) {
		Vector4 vec1 = new Vector4(1.0f, 1.0f, 1.0f, 1.0f);
		Vector vec1clone = vec1;
		
		System.out.println("Size of copied vec1 BEFORE changing the original: " + vec1clone.getSquaredSize());
		
		vec1.setX(2.0f);
		
		System.out.println("Size of copied vec1 AFTER changing the original: " + vec1clone.getSquaredSize());
		
		System.out.println("--------------");
		
		Vector4 vec2 = new Vector4(1.0f, 1.0f, 1.0f, 1.0f);
		Vector vec2clone = vec2.clone();
		
		System.out.println("Size of cloned vec2 BEFORE changing the original: " + vec2clone.getSquaredSize());
		
		vec2.setX(2.0f);
		
		System.out.println("Size of cloned vec1 AFTER changing the original: " + vec2clone.getSquaredSize());
	}

}
