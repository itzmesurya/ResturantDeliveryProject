
public abstract class User {
	protected static int idCount = 1;
	protected int id;
	protected int level;
	protected String username;
	protected String password;
	protected String first_name;
	protected String last_name;
	protected String address;
	protected String email;
	protected String phone;
	
	public User(String username, String password, String first_name, String last_name, String address, String email, String phone) {
		this.id = idCount++; //This will be changed eventually to keep track of ID# between saves
		this.username = username;
		this.password = password;
		this.first_name = first_name;
		this.last_name = last_name;
		this.address = address;
		this.email = email;
		this.phone = phone;
	}
	
}
