package designPatterns.behavioralPatterns.mediator;

import designPatterns.behavioralPatterns.mediator.mediator.Item;
import designPatterns.behavioralPatterns.mediator.mediator.LocalTradingServer;
import designPatterns.behavioralPatterns.mediator.mediator.Player;
import designPatterns.behavioralPatterns.mediator.mediator.TraderNPC;

/**
 * 
 * @author ForgotMyCode
 * @implSpec Looser coupling, provides methods for objects to communicate with each other without having to directly access them.
 *
 */
public class Main {

	public static void main(String[] args) {
		final LocalTradingServer localTradingServer = new LocalTradingServer();
		
		final Player player = new Player(localTradingServer);
		System.out.println("Player has $" + player.getMoney() + ".");
		
		final TraderNPC trader = new TraderNPC(localTradingServer);
		
		final Item expensiveItem = new Item("Health potion", 200);
		final Item cheapItem = new Item("Apple", 60);
		
		player.tryToBuy(expensiveItem, trader);
		System.out.println("Player has $" + player.getMoney() + ".");
		
		player.tryToBuy(cheapItem, trader);
		System.out.println("Player has $" + player.getMoney() + ".");
	}

}
