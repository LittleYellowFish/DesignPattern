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
//抽象工厂 优点：分离接口与实现，解耦，灵活易用 ；缺点：需要穿件更多的类文件，如果有新的产品类，就需要修改抽象工厂