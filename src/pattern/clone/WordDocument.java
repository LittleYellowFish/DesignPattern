package pattern.clone;

import java.util.ArrayList;

/**
 * �ŵ㣺��newһ������Ϊ��ʱ�ͳɱ��ܸ�ʱ�������������
 * ȱ�㣺��Ϊ�����ڴ��п���������ռһ���ڴ棬���о��ǹ��캯������ִ��
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
		//��������Ҳ��Ҫ������������
		doc.images=(ArrayList<String>) this.images.clone();
		return doc;
	}
}
