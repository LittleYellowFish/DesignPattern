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
//������ģʽ  �ŵ㣺�������봦���߽�������� ȱ�㣺���������̫�࣬��ô�����ض���Ӱ������