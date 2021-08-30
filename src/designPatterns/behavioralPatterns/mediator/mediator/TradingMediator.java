package designPatterns.behavioralPatterns.mediator.mediator;

public interface TradingMediator {
	
	public void tryToBuy(Buyer buyer, Item item, Seller seller);
	
	public boolean hasEnoughMoneyToBuyItem(Buyer buyer, Item item);
	
	public void takeMoneyFrom(Buyer buyer, int amount);
	
}
