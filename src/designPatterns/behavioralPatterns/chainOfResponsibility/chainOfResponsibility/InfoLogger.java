package designPatterns.behavioralPatterns.chainOfResponsibility.chainOfResponsibility;

public class InfoLogger extends Logger {

	public InfoLogger() {
		super(Logger.INFO);
	}
	
	public InfoLogger(Logger next) {
		super(Logger.INFO, next);
	}

	@Override
	protected void performLog(String message) {
		System.out.println("[INFO] " + message);
	}

}
