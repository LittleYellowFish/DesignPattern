package pattern.strategy;

public class BusStrategy implements CaculateStratgy{

	@Override
	public int calculatePrice(int km) {
		System.out.println("�˹�����2Ԫ");
		return 2;
	}

}
