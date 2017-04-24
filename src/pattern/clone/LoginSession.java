package pattern.clone;

import pattern.clone.User.Address;

public class LoginSession {

	static LoginSession session=null;
	
	private User loginedUser=new User(new Address("北京市"));
	
	public static LoginSession getLoginSession(){
		if(session==null){
			session=new LoginSession();
		}
		return session;
	}

	public User getLoginedUser() {
//		return loginedUser;
		return loginedUser.clone();
	}

	//当前包可以访问
	 void setLoginedUser(User loginedUser) {
		this.loginedUser = loginedUser;
	}
	
	
}
