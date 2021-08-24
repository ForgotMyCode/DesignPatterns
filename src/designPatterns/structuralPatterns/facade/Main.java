package designPatterns.structuralPatterns.facade;

import designPatterns.structuralPatterns.facade.facade.SystemFacade;

/**
 * 
 * @author ForgotMyCode
 * @implSpec Simple class that hides complexity of system of some other classes.
 *
 */
public class Main {

	public static void main(String[] args) {
		final SystemFacade facade = new SystemFacade();
		facade.simpleMethodCall();
	}

}
