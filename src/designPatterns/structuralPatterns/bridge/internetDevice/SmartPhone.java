package designPatterns.structuralPatterns.bridge.internetDevice;

import designPatterns.structuralPatterns.bridge.internetServiceProvider.InternetProvider;

public class SmartPhone extends AbstractInternetConnector {

	public SmartPhone(InternetProvider internetProvider) {
		super(internetProvider);
	}

	@Override
	public void customConnect() {
		System.out.println("Custom connection...");
		internetProvider.connect();
	}

}
