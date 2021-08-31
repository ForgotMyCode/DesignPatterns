package designPatterns.behavioralPatterns.observer.observer;

import java.util.ArrayList;
import java.util.List;

public class ObjectDoingSomethingInteresting {
	List<EventListener> myEventListeners = new ArrayList<>();
	
	public void notifyOnInterestingEvent(EventListener listener) {
		myEventListeners.add(listener);
	}
	
	public void interestingEvent() {
		for(final EventListener listener : myEventListeners) {
			listener.onEventHappened();
		}
	}

}
