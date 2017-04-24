package pattern.clone.clone2;

import pattern.clone.LoginSession;
import pattern.clone.User;
import pattern.clone.User.Address;

public class LoginTest {
	public static void main(String[] args) {
		System.out.println(LoginSession.getLoginSession().getLoginedUser().address.city);
		
		User oldUser=LoginSession.getLoginSession().getLoginedUser();
		oldUser.address=new Address("…œ∫£ –");
		
		System.out.println(LoginSession.getLoginSession().getLoginedUser().address.city);
	}
}
