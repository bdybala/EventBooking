package data.eventPlace;

public class EventPlace {

	private int id;
	private String name;
	private String type;
	private String address;
	private int capacity;			// nullable
	
	public EventPlace() {
	}
	
	
	
	public EventPlace(int id, String name, String addres, String type, int capacity) {
		this.id = id;
		this.name = name;
		this.address = addres;
		this.type = type;
		this.capacity = capacity;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	
}
