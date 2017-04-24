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

//状态模式   优点：结构清晰，易扩展，已维护   缺点：增加了很多类和对象
