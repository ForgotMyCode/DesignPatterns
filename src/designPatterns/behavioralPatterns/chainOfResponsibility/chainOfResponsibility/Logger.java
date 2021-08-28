package designPatterns.behavioralPatterns.chainOfResponsibility.chainOfResponsibility;

public abstract class Logger {
	
	public static final int DEBUG = 0;
	public static final int INFO = 1;
	public static final int WARNING = 2;
	public static final int ERROR = 3;
	
	protected int level;
	protected Logger next;
	
	public Logger(int level) {
		this.level = level;
		this.next = null;
	}
	
	public Logger(int level, Logger next) {
		this(level);
		this.next = next;
	}
	
	public void log(int level, String message) {
		if(this.level <= level) {
			performLog(message);
		}
		
		if(this.next != null) {
			this.next.log(level, message);
		}
		
	}
	
	protected abstract void performLog(String message);

}
