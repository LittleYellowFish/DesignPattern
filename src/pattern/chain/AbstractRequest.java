package pattern.chain;

public abstract class AbstractRequest {

	private Object obj;

	public AbstractRequest(Object obj) {
		super();
		this.obj=obj;
	}
	/**
	 * ��������ݶ���
	 * @return
	 */
	public Object getContent(){
		return obj;
	}
	
	/**
	 * ��ȡ���󼶱�
	 * @return
	 */
	public abstract int getRequestLevel();
	
}
