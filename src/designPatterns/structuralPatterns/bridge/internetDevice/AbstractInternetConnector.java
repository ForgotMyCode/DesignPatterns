package designPatterns.structuralPatterns.bridge.internetDevice;

import designPatterns.structuralPatterns.bridge.internetServiceProvider.InternetProvider;

public abstract class AbstractInternetConnector {
	
	protected InternetProvider internetProvider;
	
	public AbstractInternetConnector(InternetProvider internetProvider) {
		this.internetProvider = internetProvider;
	}

	public void connect() {
		internetProvider.connect();
	}
	
	public abstract void customConnect();
	
}
