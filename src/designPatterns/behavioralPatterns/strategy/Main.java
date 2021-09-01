package designPatterns.behavioralPatterns.strategy;

import designPatterns.behavioralPatterns.strategy.strategy.NumberPicker;
import designPatterns.behavioralPatterns.strategy.strategy.PickTheFirstNumberStrategy;
import designPatterns.behavioralPatterns.strategy.strategy.RandomNumberStrategy;

/**
 * 
 * @author ForgotMyCode
 * @implSpec Object with some kind of Strategy object that executes some algorithm. This way, an algorithm can be chosen at runtime via composition.
 *
 */
public class Main {

	public static void main(String[] args) {
		final NumberPicker numberPicker = new NumberPicker(new PickTheFirstNumberStrategy());
		System.out.println(numberPicker.pickNumber(new int[] {1, 2, 3}));
		
		final NumberPicker numberPicker2 = new NumberPicker(new RandomNumberStrategy());
		System.out.println(numberPicker2.pickNumber(new int[] {4, 5, 6}));
	}

}
