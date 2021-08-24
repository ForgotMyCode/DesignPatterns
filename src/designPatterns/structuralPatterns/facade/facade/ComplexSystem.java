package designPatterns.structuralPatterns.facade.facade;

public class ComplexSystem {

	public ComplexSystem2 doSomethingComplex() {
		return new ComplexSystem2();		
	}
	
	public void doSomethingMoreComplex(ComplexSystem2 arg) {
		arg.doSomethingComplex();
	}
}
