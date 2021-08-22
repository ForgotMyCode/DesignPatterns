package designPatterns.structuralPatterns.bridge.internetServiceProvider;

public class ConcreteInternetProviderB implements InternetProvider {

	@Override
	public void connect() {
		System.out.println("Connected to internet provider B.");
	}

}
