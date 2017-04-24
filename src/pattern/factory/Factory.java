package pattern.factory;

public abstract class Factory {

	/**
	 * 抽象工厂方法，由具体工厂类取实现
	 * @return
	 */
	public abstract <T extends Product> T createProduct(Class<T> clz);
}
