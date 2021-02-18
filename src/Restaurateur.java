
public class Restaurateur extends User {
	
	public Restaurateur(String username, String password, String first_name, String last_name, String address, String email, String phone) {
		super(username, password, first_name, last_name, address, email, phone);
		this.level = 2;
	}
	
}