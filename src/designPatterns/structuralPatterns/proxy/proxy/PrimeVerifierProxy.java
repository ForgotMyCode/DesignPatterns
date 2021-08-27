package designPatterns.structuralPatterns.proxy.proxy;

import java.util.HashMap;
import java.util.Map;

public class PrimeVerifierProxy implements IPrimeVerifier {
	
	private PrimeVerifier primeVerifier;
	private Map<Integer, Boolean> primeVerifierCache;
	
	public PrimeVerifierProxy() {
		this.primeVerifier = new PrimeVerifier();
		this.primeVerifierCache = new HashMap<>();
	}

	@Override
	public boolean isPrime(int x) {
		if(primeVerifierCache.containsKey(x)) {
			System.out.println("Got cached result!");
			
			return primeVerifierCache.get(x);
		}
		// else: result not cached
		boolean result = primeVerifier.isPrime(x);
		
		primeVerifierCache.put(x, result);
		
		return result;
	}
	

}
