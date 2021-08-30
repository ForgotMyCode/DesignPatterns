package designPatterns.behavioralPatterns.mediator.mediator;

public interface Buyer {
	
	public void tryToBuy(Item item, Seller seller);

	public int getMoney();
	
	public void takeMoney(int amount);
	
	public void notifyPurchaseOK();
	
	public void notifyPurchaseFailed(String reason);
	
}
