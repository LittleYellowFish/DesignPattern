package pattern.strategy;

public class BusStrategy implements CaculateStratgy{

	@Override
	public int calculatePrice(int km) {
		System.out.println("³Ë¹«½»£º2Ôª");
		return 2;
	}

}
