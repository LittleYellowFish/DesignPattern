package pattern.chain;

public class Handler2 extends Abstracthandler{

	@Override
	protected int getHandlerLevel() {
		return 2;
	}

	@Override
	protected void handle(AbstractRequest request) {
		System.out.println("handler2 handle request:"+request.getRequestLevel());
		
	}

}
