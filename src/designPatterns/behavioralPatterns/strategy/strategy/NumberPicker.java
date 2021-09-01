package designPatterns.behavioralPatterns.strategy.strategy;

public class NumberPicker {

	private NumberPickingStrategy numberPickingStrategy;
	
	public NumberPicker(NumberPickingStrategy numberPickingStrategy) {
		this.numberPickingStrategy = numberPickingStrategy;
	}
	
	public int pickNumber(int[] numbers) {
		return numberPickingStrategy.pickNumber(numbers);
	}
}
