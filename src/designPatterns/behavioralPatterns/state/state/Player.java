package designPatterns.behavioralPatterns.state.state;

public class Player {
	
	private State state;
	
	public Player() {
		this.state = new StandingState(this);
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public void attackCommand() {
		state.onAttack();
	}
	
	public void attackEndCommand() {
		state.onAttackEnd();
	}
	
	public void moveCommand() {
		state.onMove();
	}
	
	public void moveEndCommand() {
		state.onMoveEnd();
	}
	
	public void attack() {
		System.out.println("Attacking...");
	}
	
	public void move() {
		System.out.println("Moving...");
	}
	
	public void stand() {
		System.out.println("Standing...");
	}
}
