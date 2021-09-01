package designPatterns.behavioralPatterns.memento.memento;

public class CareTaker {
	
	private Traveler stateObject;
	
	public CareTaker(Traveler stateObject) {
		this.stateObject = stateObject;
	}
	
	private class State {
		private Memento momento;
		private State next;
		private State previous;
		
		public State(Memento momento, State previous) {
			this.momento = momento;
			this.previous = previous;
			this.next = null;
		}
		
		public Memento getMomento() {
			return momento;
		}
		
		public State getNext() {
			return next;
		}
		
		public void setNext(State next) {
			this.next = next;
		}

		public State getPrevious() {
			return previous;
		}			
	}
	
	private State currentState = null;
	
	private boolean hasPreviousState() {
		return this.currentState != null && this.currentState.getPrevious() != null;
	}
	
	private boolean hasNextState() {
		return this.currentState != null && this.currentState.getNext() != null;
	}
	
	public void undo() {
		if(hasPreviousState()) {
			currentState = currentState.getPrevious();
			stateObject.restore(currentState.getMomento());
		}
		else {
			currentState = null;
			System.out.println("Nothing to undo!");
		}
	}
	
	public void redo() {
		if(hasNextState()) {
			currentState = currentState.getNext();
			stateObject.restore(currentState.getMomento());
		}
		else {
			System.out.println("Nothing to redo!");
		}
	}
	
	public void addState(Memento momento) {
		final State newState = new State(momento, currentState);
		if(currentState != null) {
			currentState.setNext(newState);
		}
		currentState = newState;
	}
}
