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

//״̬ģʽ     �ŵ㣺�ṹ������������ϣ�����չ      ȱ�㣺���Ӻܶ�����