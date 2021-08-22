package designPatterns.structuralPatterns.bridge;

import designPatterns.structuralPatterns.bridge.internetDevice.AbstractInternetConnector;
import designPatterns.structuralPatterns.bridge.internetDevice.SmartPhone;
import designPatterns.structuralPatterns.bridge.internetDevice.SmartTV;
import designPatterns.structuralPatterns.bridge.internetServiceProvider.ConcreteInternetProviderA;
import designPatterns.structuralPatterns.bridge.internetServiceProvider.ConcreteInternetProviderB;
import designPatterns.structuralPatterns.bridge.internetServiceProvider.InternetProvider;

/**
 * 
 * @author ForgotMyCode
 * @implSpec Use to split class into more abstract structure, where functionality may vary
 * functionA uses functionB - make functionB abstract and implement it. In the class using functionA, take
 * implementation of functionB as a member and implement functionA in child class.
 *
 */
public class Main {

	public static void main(String[] args) {
		final InternetProvider internetProviderA = new ConcreteInternetProviderA();
		final InternetProvider internetProviderB = new ConcreteInternetProviderB();
		
		final AbstractInternetConnector device1 = new SmartPhone(internetProviderA);
		final AbstractInternetConnector device2 = new SmartTV(internetProviderB);
		
		device1.connect();
		device2.customConnect();
	}

}
