package designPatterns.creationalPatterns.prototype.prototype;

public class Vector4 extends Vector3 implements Vector {
	
	private float w;
	
	public Vector4(float x, float y, float z, float w) {
		super(x, y, z);
		this.w = w;
	}
	
	public Vector4(Vector4 prototype) {
		super(prototype);
		this.w = prototype.w;
	}

	@Override
	public Vector clone() {
		return new Vector4(this);
	}

	@Override
	public float getSquaredSize() {
		return super.getSquaredSize() + w*w;
	}

}
