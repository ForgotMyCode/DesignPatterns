package designPatterns.behavioralPatterns.template.template;

public class EnglishIntroduction extends Introduction {

	@Override
	public void greet() {
		System.out.println("Hello!");
	}

	@Override
	public void sayMyName() {
		System.out.println("My name is John.");
	}

	@Override
	public void askHowAreYou() {
		System.out.println("How are you?");		
	}

}
