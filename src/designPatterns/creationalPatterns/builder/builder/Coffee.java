package designPatterns.creationalPatterns.builder.builder;

public class Coffee {

	private boolean	drinkable, sweet, withMilk, withCoffee, withWhiskey, withWhippedCream;
	private MilkKind milkKind;
	
	public Coffee() {
		drinkable = false;
		sweet = false;
		withMilk = false;
		withCoffee = false;
		withWhiskey = false;
		withWhippedCream = false;
		milkKind = MilkKind.DefaultMax;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Coffee, that is ")
		.append(drinkable ? "drinkable" : "not drinkable")
		.append(", ")
		.append(withMilk ? ("with " + milkKind.toString() + " milk") : "without milk")
		.append(", ")
		.append(withCoffee ? "with coffee" : "without coffee")
		.append(", ")
		.append(withWhiskey ? "with whiskey" : "without whiskey")
		.append(", ")
		.append(withWhippedCream ? "with whipped cream" : "without whipped cream");
		
		return sb.toString();
	}

	public MilkKind getMilkKind() {
		return milkKind;
	}

	public void setMilkKind(MilkKind milkKind) {
		this.milkKind = milkKind;
	}

	public boolean isDrinkable() {
		return drinkable;
	}

	public void setDrinkable(boolean drinkable) {
		this.drinkable = drinkable;
	}

	public boolean isSweet() {
		return sweet;
	}

	public void setSweet(boolean sweet) {
		this.sweet = sweet;
	}

	public boolean isWithMilk() {
		return withMilk;
	}

	public void setWithMilk(boolean withMilk) {
		this.withMilk = withMilk;
	}

	public boolean isWithCoffee() {
		return withCoffee;
	}

	public void setWithCoffee(boolean withCoffee) {
		this.withCoffee = withCoffee;
	}

	public boolean isWithWhiskey() {
		return withWhiskey;
	}

	public void setWithWhiskey(boolean withWhiskey) {
		this.withWhiskey = withWhiskey;
	}

	public boolean isWithWhippedCream() {
		return withWhippedCream;
	}

	public void setWithWhippedCream(boolean withWhippedCream) {
		this.withWhippedCream = withWhippedCream;
	}
	
	
}
