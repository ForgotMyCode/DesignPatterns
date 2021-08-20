package designPatterns.structuralPatterns.adapter;

public class CompatibleObject implements InterfaceA {
	
	private float value;
	
	public CompatibleObject() {}
	
	public CompatibleObject(float init) {
		this.value = init * 10.0f;
	}

	@Override
	public float someMethod() {
		return this.value * 3.0f;
	}

}
