package designPatterns.behavioralPatterns.state.state;

public class StandingState extends State {

	public StandingState(Player player) {
		super(player);
		player.stand();
	}

	@Override
	public void onAttack() {
		player.setState(new AttackingState(player));
	}

	@Override
	public void onAttackEnd() {}

	@Override
	public void onMove() {
		player.setState(new MovingState(player));
	}

	@Override
	public void onMoveEnd() {}
	
}
