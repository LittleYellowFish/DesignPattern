package pattern.clone;

import pattern.clone.User.Address;

public class LoginSession {

	static LoginSession session=null;
	
	private User loginedUser=new User(new Address("������"));
	
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

	//��ǰ�����Է���
	 void setLoginedUser(User loginedUser) {
		this.loginedUser = loginedUser;
	}
	
	
}
