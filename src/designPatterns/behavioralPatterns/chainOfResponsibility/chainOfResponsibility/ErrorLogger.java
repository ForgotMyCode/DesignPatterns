package designPatterns.behavioralPatterns.chainOfResponsibility.chainOfResponsibility;

public class ErrorLogger extends Logger {

	public ErrorLogger() {
		super(Logger.ERROR);
	}
	
	public ErrorLogger(Logger next) {
		super(Logger.ERROR, next);
	}

	@Override
	protected void performLog(String message) {
		System.out.println("[ERROR] " + message);
	}

}
