package designPatterns.behavioralPatterns.state.state;

public abstract class State {

	protected Player player;
	
	public State(Player player) {
		this.player = player;
	}
	
	public abstract void onAttack();
	
	public abstract void onAttackEnd();
	
	public abstract void onMove();
	
	public abstract void onMoveEnd();
	
}
