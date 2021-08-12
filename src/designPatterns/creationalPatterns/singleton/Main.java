package designPatterns.creationalPatterns.singleton;

/**
 * 
 * @author ForgotMyCode
 * @implSpec There is only one global object, cannot be instantiated, provides {@code getInstance} method.
 *
 */
public class Main {

	public static void main(String[] args) {
		Database database = Database.getInstance();
		database.doSomethingWithDatabase();
	}

}
