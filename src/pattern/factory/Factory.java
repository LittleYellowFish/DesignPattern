package pattern.factory;

public abstract class Factory {

	/**
	 * ���󹤳��������ɾ��幤����ȡʵ��
	 * @return
	 */
	public abstract <T extends Product> T createProduct(Class<T> clz);
}
