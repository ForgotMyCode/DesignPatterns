package designPatterns.behavioralPatterns.mediator.mediator;

public class LocalTradingServer implements TradingMediator {

	@Override
	public void tryToBuy(Buyer buyer, Item item, Seller seller) {
		seller.handlePurchaseRequest(buyer, item);
	}

	@Override
	public boolean hasEnoughMoneyToBuyItem(Buyer buyer, Item item) {
		return buyer.getMoney() >= item.getPrice();
	}

	@Override
	public void takeMoneyFrom(Buyer buyer, int amount) {
		buyer.takeMoney(amount);
	}

}
