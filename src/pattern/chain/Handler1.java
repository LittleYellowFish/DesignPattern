package pattern.chain;

public class Handler1 extends Abstracthandler{

	@Override
	protected int getHandlerLevel() {
		return 1;
	}

	@Override
	protected void handle(AbstractRequest request) {
		System.out.println("handler1 handle request:"+request.getRequestLevel());
		
	}

}
