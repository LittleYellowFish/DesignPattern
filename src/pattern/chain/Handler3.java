package pattern.chain;

public class Handler3 extends Abstracthandler{

	@Override
	protected int getHandlerLevel() {
		return 3;
	}

	@Override
	protected void handle(AbstractRequest request) {
		System.out.println("handler3 handle request:"+request.getRequestLevel());
		
	}

}
