package pattern.state;

public class LoginedState implements UserSate {

	@Override
	public void comment() {
		System.out.println("ת��΢��");

	}

	@Override
	public void forward() {
		System.out.println("����");

	}

}
