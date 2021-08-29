package designPatterns.behavioralPatterns.command.command;

public class AddCommand extends Command {

	public AddCommand(Calculator calculator, int arg) {
		super(calculator, arg);
	}

	@Override
	public void execute() {
		final Calculator calculator = getCalculator();
		calculator.setNumber(calculator.getNumber() + arg);
	}

}
