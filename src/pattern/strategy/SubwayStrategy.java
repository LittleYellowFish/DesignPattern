package pattern.strategy;

public class SubwayStrategy implements CaculateStratgy{

	@Override
	public int calculatePrice(int km) {
		System.out.println("�˵�����3Ԫ");
		return 3;
	}

}
