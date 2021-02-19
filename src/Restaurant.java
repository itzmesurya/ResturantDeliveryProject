
public class Restaurant {
	private static int idCount = 1;
	private int id;
	private String name;
	private String address;
	private String phone;
	private String[] delivery_areas;
	private String[][] hours;
	
	public Restaurant(String name, String address, String phone, String[] delivery_areas, String[][] hours) {
		this.id = idCount++;//This will be changed eventually to keep track of ID# between saves
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.delivery_areas = delivery_areas;
		this.hours = hours;
	}
}
