package designPatterns.behavioralPatterns.state.state;

public class MovingState extends State {

	public MovingState(Player player) {
		super(player);
		player.move();
	}

	@Override
	public void onAttack() {
		player.setState(new AttackingState(player));
	}

	@Override
	public void onAttackEnd() {}

	@Override
	public void onMove() {}

	@Override
	public void onMoveEnd() {
		player.setState(new StandingState(player));
	}

}
