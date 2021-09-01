package designPatterns.behavioralPatterns.state;

import designPatterns.behavioralPatterns.state.state.Player;

/**
 * 
 * @author ForgotMyCode
 * @implSpec Approach of creating object's state machine instead of large switches.
 *
 */
public class Main {

	public static void main(String[] args) {
		final Player player = new Player();
		
		System.out.println("-- Test: Stand -> Attack -> Stand");
		player.attackCommand();
		player.moveCommand();
		player.attackCommand();
		player.moveEndCommand();
		player.attackEndCommand();
		
		System.out.println("-- Test: Stand -> Move -> Attack -> Stand");
		player.moveCommand();
		player.moveCommand();
		player.attackEndCommand();
		player.attackCommand();
		player.attackEndCommand();
		
		System.out.println("-- Test: Stand -> Move -> Stand");
		player.moveCommand();
		player.moveCommand();
		player.attackEndCommand();
		player.moveEndCommand();
	}

}
