package designPatterns.behavioralPatterns.command.command;

public abstract class Command {
	private int previousResult;
	private Calculator calculator;
	protected int arg;
	
	public Command(Calculator calculator, int arg) {
		this.calculator = calculator;
		this.previousResult = calculator.getNumber();
		this.arg = arg;
	}
	
	public void undo() {
		this.calculator.setNumber(previousResult);
	}
	
	protected Calculator getCalculator() {
		return this.calculator;
	}
	
	public abstract void execute();

}
