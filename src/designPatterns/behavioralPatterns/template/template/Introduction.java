package designPatterns.behavioralPatterns.template.template;

public abstract class Introduction {
	
	public final void perform() {
		greet();
		sayMyName();
		askHowAreYou();
	}
	
	public abstract void greet();
	
	public abstract void sayMyName();
	
	public abstract void askHowAreYou();

}
