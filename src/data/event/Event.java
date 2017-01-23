package data.event;

import java.util.Date;

public class Event {

	private int id;
	private String name;
	private Date startDate;
	private int ageRestriction;			// nullable
	private String description;			// nullable
	private String type;				// nullable
	private int placeiD;
	private int useriD;					// nullable
	
	public Event() {
	}

	public Event(int id, String name, Date startDate, int ageRestriction, String description, String type, int placeiD,
			int useriD) {
		this.id = id;
		this.name = name;
		this.startDate = startDate;
		this.ageRestriction = ageRestriction;
		this.description = description;
		this.type = type;
		this.placeiD = placeiD;
		this.useriD = useriD;
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

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public int getAgeRestriction() {
		return ageRestriction;
	}

	public void setAgeRestriction(int ageRestriction) {
		this.ageRestriction = ageRestriction;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPlaceiD() {
		return placeiD;
	}

	public void setPlaceiD(int placeiD) {
		this.placeiD = placeiD;
	}

	public int getUseriD() {
		return useriD;
	}

	public void setUseriD(int useriD) {
		this.useriD = useriD;
	}
	
	
}
