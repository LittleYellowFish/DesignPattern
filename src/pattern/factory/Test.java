package pattern.factory;

public class Test {

	public static void main(String[] args) {
		Factory factory=new ConcreteFactory();
		ConcretProductA cpA=factory.createProduct(ConcretProductA.class);
		ConcretProductB cpB=factory.createProduct(ConcretProductB.class);
		
		cpA.method();
		cpB.method();
	}
}
