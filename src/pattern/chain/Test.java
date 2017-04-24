package pattern.chain;

public class Test {

	public static void main(String[] args) {
		Abstracthandler handler1 = new Handler1();
		Abstracthandler handler2 = new Handler2();
		Abstracthandler handler3 = new Handler3();

		handler1.nextHandler = handler2;
		handler2.nextHandler = handler3;

		AbstractRequest request1 = new Request1("requst1");
		AbstractRequest request2 = new Request2("requst2");
		AbstractRequest request3 = new Request3("requst3");

		handler1.handlerRequest(request1);
		handler1.handlerRequest(request2);
		handler1.handlerRequest(request3);
	}
}
//责任链模式  优点：请求者与处理者解耦，代码灵活； 缺点：如果处理者太多，那么遍历必定会影响性能