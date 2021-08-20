package designPatterns.structuralPatterns.adapter;

public class Important {

	// I really need to use this method but it only works for InterfaceA
	public void importantMethod(InterfaceA iKnowThisOnly) {
		System.out.println(iKnowThisOnly.someMethod());
	}
	
}
