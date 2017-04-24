package pattern.clone;

import java.util.ArrayList;

/**
 * 优点：在new一个对象极为耗时和成本很高时，可以提高性能
 * 缺点：因为是在内存中拷贝，所以占一定内存，还有就是构造函数不会执行
 * @author yl
 *
 */
public class WordDocument implements Cloneable{

	private String text;
	private ArrayList<String> images=new ArrayList<String>();
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {

		WordDocument doc=(WordDocument) super.clone();
		doc.text=this.text;
		//引用类型也需要拷贝，这叫深拷贝
		doc.images=(ArrayList<String>) this.images.clone();
		return doc;
	}
}
