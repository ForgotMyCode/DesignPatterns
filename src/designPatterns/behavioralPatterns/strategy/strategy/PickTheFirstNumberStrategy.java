package designPatterns.behavioralPatterns.strategy.strategy;

public class PickTheFirstNumberStrategy implements NumberPickingStrategy {

	@Override
	public int pickNumber(int[] numbers) {
		return numbers[0];
	}

}
