package pattern.state;

public class Test {

	public static void main(String[] args) {
		LoginContext.getLoginContext().forward();
		LoginContext.getLoginContext().comment();

		LoginContext.getLoginContext().setState(new LoginedState());
		LoginContext.getLoginContext().forward();
		LoginContext.getLoginContext().comment();
	}
}

//״̬ģʽ   �ŵ㣺�ṹ����������չ����ά��   ȱ�㣺�����˺ܶ���Ͷ���
