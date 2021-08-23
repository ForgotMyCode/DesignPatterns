package designPatterns.structuralPatterns.decorator.decorator;

public class DoorOpener implements IOpener {
	
	private DoorType doorType;
	
	public DoorOpener(DoorType doorType) {
			this.doorType = doorType;
	}

	@Override
	public void open() {
		System.out.println(doorType.toString() + " door opened...");
	}

}
