package pattern.state;

public interface UserSate {

	/**
	 * ת��
	 * 
	 * @param context
	 */
	public void forward();

	/**
	 * ����
	 * 
	 * @param context
	 */
	public void comment();
}
