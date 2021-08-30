package designPatterns.behavioralPatterns.mediator.mediator;

public class Player implements Buyer {
	
	private TradingMediator tradingServer;
	private int money = 100;
	
	public Player(TradingMediator tradingServer) {
		this.tradingServer = tradingServer;
	}

	@Override
	public void notifyPurchaseOK() {
		System.out.println("Purchase completed!");		
	}

	@Override
	public void notifyPurchaseFailed(String reason) {
		System.out.println("Purchase failed! " + reason);		
	}
	
	@Override
	public int getMoney() {
		return this.money;
	}

	@Override
	public void tryToBuy(Item item, Seller seller) {
		tradingServer.tryToBuy(this, item, seller);
	}

	@Override
	public void takeMoney(int amount) {
		this.money -= amount;
	}

}
