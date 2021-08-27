package designPatterns.structuralPatterns.proxy;

import designPatterns.structuralPatterns.proxy.proxy.IPrimeVerifier;
import designPatterns.structuralPatterns.proxy.proxy.PrimeVerifierProxy;

/**
 * 
 * @author ForgotMyCode
 * @implSpec A class implementing the same interface as a substitute for the original class.
 *
 */
public class Main {

	public static void main(String[] args) {
		IPrimeVerifier primeVerifier = new PrimeVerifierProxy();
		
		for(int i = 0; i < 10; ++i)
			System.out.println(primeVerifier.isPrime(1234567));
		
	}

}
