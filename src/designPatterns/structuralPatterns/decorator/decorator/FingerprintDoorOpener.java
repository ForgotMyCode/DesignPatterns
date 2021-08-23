package designPatterns.structuralPatterns.decorator.decorator;

public class FingerprintDoorOpener extends DoorOpenerDecorator {

	public FingerprintDoorOpener(IOpener doorOpener) {
		super(doorOpener);
	}
	
	@Override
	public void open() {
		System.out.println("Fingerprint accepted...");
		this.doorOpener.open();
	}

}
