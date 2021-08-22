package designPatterns.structuralPatterns.bridge.internetServiceProvider;

public class ConcreteInternetProviderA implements InternetProvider {

	@Override
	public void connect() {
		System.out.println("Connected to internet provider A.");
	}

}
