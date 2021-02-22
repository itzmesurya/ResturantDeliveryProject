
/**
 * @author Alex
 * Manager can create, edit and delete restaurants. Can only edit and delete restaurants they created.
 */
public class Manager extends User {
	
	/**
	 * @param username
	 * @param password
	 * @param first_name
	 * @param last_name
	 * @param address
	 * @param email
	 * @param phone
	 */
	public Manager(String username, String password, String first_name, String last_name, String address, String email, String phone) {
		super(username, password, first_name, last_name, address, email, phone);
		this.level = 3;
	}
	
	/**
	 * @param username
	 * @param password
	 */
	public Manager(String username, String password) {
		super(username, password);
		this.level = 3;
	}
	
}
