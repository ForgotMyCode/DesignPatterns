package designPatterns.behavioralPatterns.command.command;

import java.util.Stack;

public class Calculator {
	private int number;
	private Stack<Command> commandHistory;
	
	public Calculator() {
		this.number = 0;
		this.commandHistory = new Stack<>();
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public void display() {
		System.out.println("> " + getNumber());
	}
	
	public void addCommand(Command command) {
		commandHistory.add(command);
		command.execute();
	}
	
	public void undo() {
		if(!commandHistory.isEmpty()) {
			final Command commandToUndo = commandHistory.pop();
			commandToUndo.undo();
		}
	}

}
