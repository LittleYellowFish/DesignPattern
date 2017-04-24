package pattern.clone;

public class User implements Cloneable{

	public Address address;
	
	public static class Address{
		public String city;

		public Address(String city) {
			super();
			this.city = city;
		}
		
	}

	public User() {
		super();
	}

	public User(Address address) {
		super();
		this.address = address;
	}
	
	@Override
	protected User clone() {
		User user;
		try {
			user = (User) super.clone();
			return user;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
}
