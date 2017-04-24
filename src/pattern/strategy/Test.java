package pattern.strategy;

public class Test {

	public static void main(String[] args) {
		Test test = new Test();
		test.setStrategy(new BusStrategy());
		stratgy.calculatePrice(2);
		
		test.setStrategy(new SubwayStrategy());
		stratgy.calculatePrice(3);
	}

	public static CaculateStratgy stratgy;

	private void setStrategy(CaculateStratgy stratgy) {
		this.stratgy = stratgy;
	}
	
	
}

//状态模式     优点：结构清晰，降低耦合，易扩展      缺点：增加很多子类