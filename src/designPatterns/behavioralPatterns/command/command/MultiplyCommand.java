package designPatterns.behavioralPatterns.command.command;

public class MultiplyCommand extends Command {

	public MultiplyCommand(Calculator calculator, int arg) {
		super(calculator, arg);
	}

	@Override
	public void execute() {
		final Calculator calculator = getCalculator();
		calculator.setNumber(calculator.getNumber() * arg);
	}

}
