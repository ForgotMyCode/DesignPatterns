package designPatterns.structuralPatterns.adapter;


/**
 * 
 * @author ForgotMyCode
 * @implSpec A way to make instances of different interfaces work together.
 * Extend a compatible class or implement compatible interface,
 * take incompatible instance as an argument in constructor. 
 *
 */
public class Main {

	public static void main(String[] args) {
		final Important important = new Important();
		
		final CompatibleObject compatibleObject = new CompatibleObject(123.0f);
		final IncompatibleObject incompatibleObject = new IncompatibleObject(123.0f);
		
		important.importantMethod(compatibleObject);
		// important.importantMethod(incompatibleObject); // error
		
		final IncompatibleObjectAdapter incompatibleObjectAdapter = new IncompatibleObjectAdapter(incompatibleObject);
		important.importantMethod(incompatibleObjectAdapter); // ok
	}

}
