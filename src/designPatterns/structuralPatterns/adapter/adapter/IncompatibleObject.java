package designPatterns.structuralPatterns.adapter.adapter;

public class IncompatibleObject implements InterfaceB {

	private float value;
	
	public IncompatibleObject() {}
	
	public IncompatibleObject(float init) {
		this.value = init * 2.0f;
	}
	
	@Override
	public float differentMethod() {
		return this.value;
	}

	public float getValue() {
		return this.value;
	}
}
