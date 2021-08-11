package designPatterns.creationalPatterns.prototype.prototype;

public class Vector2 implements Vector {
	
	private float x, y;
	
	public Vector2(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public Vector2(Vector2 prototype) {
		this.x = prototype.x;
		this.y = prototype.y;
	}

	@Override
	public Vector clone() {
		return new Vector2(this);
	}

	@Override
	public float getSquaredSize() {
		return x*x + y*y;
	}
	
	public void setX(float x) {
		this.x = x;
	}

}
