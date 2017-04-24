package pattern.state;

public class LogoutState implements UserSate {

	@Override
	public void forward() {
		goToLoginPage();
	}

	@Override
	public void comment() {
		goToLoginPage();
	}

	private void goToLoginPage() {
		System.out.println("��ת����¼ҳ��");
	}
}
