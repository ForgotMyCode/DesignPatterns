package designPatterns.structuralPatterns.decorator.decorator;

public class DoorOpenerDecorator implements IOpener {

	protected IOpener doorOpener;
	
	public DoorOpenerDecorator(IOpener doorOpener) {
		this.doorOpener = doorOpener;
	}
	
	@Override
	public void open() {
		doorOpener.open();		
	}

}
