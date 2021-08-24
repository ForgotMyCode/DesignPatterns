package designPatterns.structuralPatterns.facade.facade;

public class SystemFacade {

	public void simpleMethodCall() {
		final ComplexSystem complexSystem = new ComplexSystem();
		final ComplexSystem2 complexSystem2 = complexSystem.doSomethingComplex();
		complexSystem.doSomethingMoreComplex(complexSystem2);
	}
	
}
