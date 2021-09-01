package designPatterns.behavioralPatterns.template.template;

public class GermanIntroduction extends Introduction {

	@Override
	public void greet() {
		System.out.println("Hallo!");
	}

	@Override
	public void sayMyName() {
		System.out.println("Ich heiﬂe Franz.");
	}

	@Override
	public void askHowAreYou() {
		System.out.println("Wie geht es?");		
	}

}
