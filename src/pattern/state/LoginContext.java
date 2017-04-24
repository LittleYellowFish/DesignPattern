package pattern.state;

public class LoginContext implements UserSate {
	UserSate mSate = new LogoutState();

	static LoginContext sLoginContext = new LoginContext();

	private LoginContext() {
		super();
	}

	public static LoginContext getLoginContext() {
		return sLoginContext;
	}

	public void setState(UserSate state) {
		this.mSate = state;
	}

	@Override
	public void forward() {
		mSate.forward();
	}

	@Override
	public void comment() {
		mSate.comment();

	}

}
