package designPatterns.behavioralPatterns.state.state;

public class AttackingState extends State {

	public AttackingState(Player player) {
		super(player);
		player.attack();
	}

	@Override
	public void onAttack() {}

	@Override
	public void onAttackEnd() {
		player.setState(new StandingState(player));
	}

	@Override
	public void onMove() {}

	@Override
	public void onMoveEnd() {}

}
