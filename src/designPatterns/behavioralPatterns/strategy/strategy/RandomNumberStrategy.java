package designPatterns.behavioralPatterns.strategy.strategy;

import java.util.Random;

public class RandomNumberStrategy implements NumberPickingStrategy {

	@Override
	public int pickNumber(int[] numbers) {
		Random rand = new Random();
		final int selection = rand.nextInt(numbers.length);
		return numbers[selection];
	}

}
