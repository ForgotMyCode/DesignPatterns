package designPatterns.behavioralPatterns.chainOfResponsibility;

import designPatterns.behavioralPatterns.chainOfResponsibility.chainOfResponsibility.DebugLogger;
import designPatterns.behavioralPatterns.chainOfResponsibility.chainOfResponsibility.ErrorLogger;
import designPatterns.behavioralPatterns.chainOfResponsibility.chainOfResponsibility.InfoLogger;
import designPatterns.behavioralPatterns.chainOfResponsibility.chainOfResponsibility.Logger;
import designPatterns.behavioralPatterns.chainOfResponsibility.chainOfResponsibility.WarningLogger;

/**
 * 
 * @author ForgotMyCode
 * @implSpec Sort of linked list of receivers, request is sent to the first one and the receiver passes it to the next,
 * while handling it by itself as well.
 *
 */
public class Main {

	public static void main(String[] args) {
		final Logger logger = new DebugLogger(new InfoLogger(new WarningLogger(new ErrorLogger())));
		
		logger.log(Logger.DEBUG, "Debug message");
		
		System.out.println("---");
		logger.log(Logger.INFO, "Info message");
		
		System.out.println("---");
		logger.log(Logger.WARNING, "Warning message");
		
		System.out.println("---");
		logger.log(Logger.ERROR, "Error message");
	}

}
