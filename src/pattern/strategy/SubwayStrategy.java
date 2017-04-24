package pattern.strategy;

public class SubwayStrategy implements CaculateStratgy{

	@Override
	public int calculatePrice(int km) {
		System.out.println("³ËµØÌú£º3Ôª");
		return 3;
	}

}
