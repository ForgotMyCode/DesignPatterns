package designPatterns.behavioralPatterns.memento.memento;

public class Traveler {
	private int x = 0;
	private int y = 0;
	
	public Memento backup() {
		return new Memento(this);
	}
	
	public void restore(Memento momento) {
		momento.restore(this);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void reportPosition() {
		System.out.println("The traveler is at [" + x + ", " + y + "].");
	}
}
