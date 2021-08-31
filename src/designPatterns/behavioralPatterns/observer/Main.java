package designPatterns.behavioralPatterns.observer;

import designPatterns.behavioralPatterns.observer.observer.ISayYeeyWhenEventHappens;
import designPatterns.behavioralPatterns.observer.observer.ObjectDoingSomethingInteresting;
import designPatterns.behavioralPatterns.observer.observer.Reporter;

/**
 * 
 * @author ForgotMyCode
 * @implSpec There is an object producing some events other objects are interested in: Listeners.
 * Listeners subscribe to the interesting object and the interesting object then notifies them when an event happens.
 *
 */
public class Main {

	public static void main(String[] args) {
		final ObjectDoingSomethingInteresting interestingObject = new ObjectDoingSomethingInteresting();
		
		final Reporter reporter = new Reporter();
		final ISayYeeyWhenEventHappens anotherListener = new ISayYeeyWhenEventHappens();
		
		interestingObject.notifyOnInterestingEvent(reporter);
		interestingObject.notifyOnInterestingEvent(anotherListener);
		
		interestingObject.interestingEvent();
	}

}
