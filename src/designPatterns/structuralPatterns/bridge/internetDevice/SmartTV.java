package designPatterns.structuralPatterns.bridge.internetDevice;

import designPatterns.structuralPatterns.bridge.internetServiceProvider.InternetProvider;

public class SmartTV extends AbstractInternetConnector {

	public SmartTV(InternetProvider internetProvider) {
		super(internetProvider);
	}

	@Override
	public void customConnect() {
		System.out.println("Custom connection...");
		internetProvider.connect();
	}

}
