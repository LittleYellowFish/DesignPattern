package pattern.chain;

public abstract class Abstracthandler {

	/**
	 * 下一个节点上的矗处理者对象
	 */
	protected Abstracthandler nextHandler;

	/**
	 * 处理请求
	 * 
	 * @param request
	 */
	public final void handlerRequest(AbstractRequest request) {
		if (getHandlerLevel() == request.getRequestLevel()) {
			handle(request);
		} else {
			if (nextHandler != null) {
				nextHandler.handlerRequest(request);
			} else {
				System.out.println("All of handler can not handle the request");
			}
		}
	}

	/**
	 * 获得处理者的处理级别
	 * 
	 * @return
	 */
	protected abstract int getHandlerLevel();

	/**
	 * 每个处理者对象的具体处理方式
	 * 
	 * @param request
	 */
	protected abstract void handle(AbstractRequest request);

}
