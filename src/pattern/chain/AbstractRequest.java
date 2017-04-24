package pattern.chain;

public abstract class AbstractRequest {

	private Object obj;

	public AbstractRequest(Object obj) {
		super();
		this.obj=obj;
	}
	/**
	 * 具体的内容对象
	 * @return
	 */
	public Object getContent(){
		return obj;
	}
	
	/**
	 * 获取请求级别
	 * @return
	 */
	public abstract int getRequestLevel();
	
}
