package designPatterns.behavioralPatterns.mediator.mediator;

public class TraderNPC implements Seller {
	
	private TradingMediator tradingServer;
	
	public TraderNPC(TradingMediator tradingServer) {
		this.tradingServer = tradingServer;
	}

	@Override
	public void handlePurchaseRequest(Buyer buyer, Item item) {
		if(tradingServer.hasEnoughMoneyToBuyItem(buyer, item)) {
			tradingServer.takeMoneyFrom(buyer, item.getPrice());
			buyer.notifyPurchaseOK();
		}
		else {
			buyer.notifyPurchaseFailed("Not enough money.");
		}
	}

}
