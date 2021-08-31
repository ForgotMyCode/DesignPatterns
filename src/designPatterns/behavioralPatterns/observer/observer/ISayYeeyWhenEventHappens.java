package designPatterns.behavioralPatterns.observer.observer;

public class ISayYeeyWhenEventHappens implements EventListener {

	@Override
	public void onEventHappened() {
		System.out.println("Yeey!");
	}

}
