package designPatterns.behavioralPatterns.memento.memento;

public class Memento {
	private int x, y;
	
	public Memento(Traveler object) {
		this.x = object.getX();
		this.y = object.getY();
	}
	
	public void restore(Traveler object) {
		object.setX(x);
		object.setY(y);
	}

}
