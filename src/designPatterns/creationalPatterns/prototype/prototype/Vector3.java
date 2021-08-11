package designPatterns.creationalPatterns.prototype.prototype;

public class Vector3 extends Vector2 implements Vector {
	
	private float z;
	
	public Vector3(float x, float y, float z) {
		super(x, y);
		this.z = z;
	}
	
	public Vector3(Vector3 prototype) {
		super(prototype);
		this.z = prototype.z;
	}

	@Override
	public Vector clone() {
		return new Vector3(this);
	}

	@Override
	public float getSquaredSize() {
		return super.getSquaredSize() + z*z;
	}

}
