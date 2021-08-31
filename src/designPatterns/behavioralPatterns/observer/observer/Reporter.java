package designPatterns.behavioralPatterns.observer.observer;

public class Reporter implements EventListener {

	@Override
	public void onEventHappened() {
		System.out.println("Reporter: Event happened!");
	}

}
