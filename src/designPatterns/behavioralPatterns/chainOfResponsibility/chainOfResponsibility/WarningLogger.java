package designPatterns.behavioralPatterns.chainOfResponsibility.chainOfResponsibility;

public class WarningLogger extends Logger {

	public WarningLogger() {
		super(Logger.WARNING);
	}
	
	public WarningLogger(Logger next) {
		super(Logger.WARNING, next);
	}

	@Override
	protected void performLog(String message) {
		System.out.println("[WARNING] " + message);
	}

}
