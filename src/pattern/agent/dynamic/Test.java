package pattern.agent.dynamic;

import java.lang.reflect.Proxy;

import pattern.agent.ILawsuit;
import pattern.agent.XiaoMin;

public class Test {

	public static void main(String[] args) {
		ILawsuit xiaoMin=new XiaoMin();
		DynamicProxy proxy=new DynamicProxy(xiaoMin);
		
		ClassLoader classLoader=xiaoMin.getClass().getClassLoader();
		ILawsuit lawsuit=(ILawsuit) Proxy.newProxyInstance(classLoader, new Class[]{ILawsuit.class}, proxy);
		
		lawsuit.submit();
		lawsuit.burden();
		lawsuit.defend();
		lawsuit.finish();
	}
}
