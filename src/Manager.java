
public class Manager extends User {
	
	public Manager(String username, String password, String first_name, String last_name, String address, String email, String phone) {
		super(username, password, first_name, last_name, address, email, phone);
		this.level = 3;
	}
	
}
