package designPatterns.structuralPatterns.adapter.adapter;

public class IncompatibleObjectAdapter extends CompatibleObject {
	
	private IncompatibleObject incompatibleObject;

	public IncompatibleObjectAdapter(IncompatibleObject incompatibleObject) {
		this.incompatibleObject = incompatibleObject;
	}
	
	@Override
	public float someMethod() {
		// some way to use this method for the instance given in constructor
		return this.incompatibleObject.differentMethod() * 15.0f;
	}

}
