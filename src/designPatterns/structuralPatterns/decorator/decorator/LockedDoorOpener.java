package designPatterns.structuralPatterns.decorator.decorator;

public class LockedDoorOpener extends DoorOpenerDecorator {

	public LockedDoorOpener(IOpener doorOpener) {
		super(doorOpener);
	}
	
	@Override
	public void open() {
		System.out.println("Lock opened...");
		this.doorOpener.open();
	}

}
