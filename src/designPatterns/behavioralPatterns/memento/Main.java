package designPatterns.behavioralPatterns.memento;

import designPatterns.behavioralPatterns.memento.memento.CareTaker;
import designPatterns.behavioralPatterns.memento.memento.Traveler;

/**
 * 
 * @author ForgotMyCode
 * @implSpec Way to backup and restore state of an object.
 *
 */
public class Main {

	public static void main(String[] args) {
		final Traveler traveler = new Traveler();
		final CareTaker careTaker = new CareTaker(traveler);
		
		traveler.reportPosition();
		careTaker.addState(traveler.backup());
		
		traveler.setX(10);
		traveler.setY(20);
		traveler.reportPosition();
		careTaker.addState(traveler.backup());
		
		traveler.setX(-8);
		traveler.setY(6);
		traveler.reportPosition();
		careTaker.addState(traveler.backup());
		
		System.out.println("UNDO");
		careTaker.undo();
		traveler.reportPosition();
		System.out.println("UNDO");
		careTaker.undo();
		traveler.reportPosition();
		System.out.println("REDO");
		careTaker.redo();
		traveler.reportPosition();
		System.out.println("UNDO");
		careTaker.undo();
		traveler.reportPosition();
		System.out.println("UNDO");
		careTaker.undo();
		traveler.reportPosition();
		
		traveler.setX(20);
		traveler.reportPosition();
		System.out.println("REDO");
		careTaker.redo();
		
	}

}
