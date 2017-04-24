package pattern.state;

public class LoginedState implements UserSate {

	@Override
	public void comment() {
		System.out.println("×ª·¢Î¢²©");

	}

	@Override
	public void forward() {
		System.out.println("ÆÀÂÛ");

	}

}
