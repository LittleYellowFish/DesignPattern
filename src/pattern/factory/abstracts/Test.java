package pattern.factory.abstracts;

import pattern.factory.abstracts.factory.Q3Factory;
import pattern.factory.abstracts.factory.Q7Factory;

public class Test {

	public static void main(String[] args) {
		Q3Factory q3Factory=new Q3Factory();
		q3Factory.createTire().tire();
		q3Factory.createEngine().engine();
		q3Factory.createBrake().brake();
		
		Q7Factory q7Factory=new Q7Factory();
		q7Factory.createTire().tire();
		q7Factory.createEngine().engine();
		q7Factory.createBrake().brake();
	}
}
//���󹤳� �ŵ㣺����ӿ���ʵ�֣����������� ��ȱ�㣺��Ҫ������������ļ���������µĲ�Ʒ�࣬����Ҫ�޸ĳ��󹤳�