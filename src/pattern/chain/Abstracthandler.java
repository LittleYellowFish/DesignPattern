package pattern.chain;

public abstract class Abstracthandler {

	/**
	 * ��һ���ڵ��ϵĴ������߶���
	 */
	protected Abstracthandler nextHandler;

	/**
	 * ��������
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
	 * ��ô����ߵĴ�����
	 * 
	 * @return
	 */
	protected abstract int getHandlerLevel();

	/**
	 * ÿ�������߶���ľ��崦��ʽ
	 * 
	 * @param request
	 */
	protected abstract void handle(AbstractRequest request);

}
