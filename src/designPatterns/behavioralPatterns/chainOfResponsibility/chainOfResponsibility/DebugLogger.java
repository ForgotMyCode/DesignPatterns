package designPatterns.behavioralPatterns.chainOfResponsibility.chainOfResponsibility;

public class DebugLogger extends Logger {

	public DebugLogger() {
		super(Logger.DEBUG);
	}
	
	public DebugLogger(Logger next) {
		super(Logger.DEBUG, next);
	}

	@Override
	protected void performLog(String message) {
		System.out.println("[DEBUG] " + message);
	}

}
