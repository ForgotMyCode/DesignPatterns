package designPatterns.behavioralPatterns.template;

import designPatterns.behavioralPatterns.template.template.EnglishIntroduction;
import designPatterns.behavioralPatterns.template.template.GermanIntroduction;

/**
 * 
 * @author ForgotMyCode
 * @implSpec Abstract class with concrete template method describing steps (function calls) to take for the algorithm.
 * Different subclasses implement these methods, but the template remains the same - avoids duplication.
 *
 */
public class Main {

	public static void main(String[] args) {
		new EnglishIntroduction().perform();
		new GermanIntroduction().perform();
	}

}
