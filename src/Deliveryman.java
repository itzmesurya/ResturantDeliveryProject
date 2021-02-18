
public class Deliveryman extends User {
	private String[] delivery_areas;
	
	public Deliveryman(String username, String password, String first_name, String last_name, String address, String email, String phone, String[] delivery_areas) {
		super(username, password, first_name, last_name, address, email, phone);
		this.level = 1;
		this.delivery_areas = delivery_areas;
	}
}
