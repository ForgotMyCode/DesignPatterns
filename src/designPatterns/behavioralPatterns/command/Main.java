package designPatterns.behavioralPatterns.command;

import designPatterns.behavioralPatterns.command.command.AddCommand;
import designPatterns.behavioralPatterns.command.command.Calculator;
import designPatterns.behavioralPatterns.command.command.MultiplyCommand;

/**
 * 
 * @author ForgotMyCode
 * @implSpec Command parent, different commands inheriting from it, remembering some data, may be executed later.
 *
 */
public class Main {

	public static void main(String[] args) {
		final Calculator calculator = new Calculator();
		
		System.out.println("0");
		
		for(int i = 0; i < 5; ++i) {
			System.out.println("+" + i);
			calculator.addCommand(new AddCommand(calculator, i));
			calculator.display();

			System.out.println("*" + i);
			calculator.addCommand(new MultiplyCommand(calculator, i));
			calculator.display();
		}
		
		System.out.println("Undo...");
		for(int i = 0; i < 11; ++i) {
			calculator.undo();
			calculator.display();
		}
	}

}
