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
	
	public Event(int id_imprezy, String nazwa, Date data, int ograniczenie_wiekowe, String opis, String typ,
			int id_miejsca, int id_uzytkownika) {
		this.id = id_imprezy;
		this.name = nazwa;
		this.startDate = data;
		this.ageRestriction = ograniczenie_wiekowe;
		this.description = opis;
		this.type = typ;
		this.placeiD = id_miejsca;
		this.useriD = id_uzytkownika;
	}
	public Event() {
	}
	
	public int getId_imprezy() {
		return id;
	}
	public void setId_imprezy(int id_imprezy) {
		this.id = id_imprezy;
	}
	public String getNazwa() {
		return name;
	}
	public void setNazwa(String nazwa) {
		this.name = nazwa;
	}
	public Date getData() {
		return startDate;
	}
	public void setData(Date data) {
		this.startDate = data;
	}
	public int getOgraniczenie_wiekowe() {
		return ageRestriction;
	}
	public void setOgraniczenie_wiekowe(int ograniczenie_wiekowe) {
		this.ageRestriction = ograniczenie_wiekowe;
	}
	public String getOpis() {
		return description;
	}
	public void setOpis(String opis) {
		this.description = opis;
	}
	public String getTyp() {
		return type;
	}
	public void setTyp(String typ) {
		this.type = typ;
	}
	public int getId_miejsca() {
		return placeiD;
	}
	public void setId_miejsca(int id_miejsca) {
		this.placeiD = id_miejsca;
	}
	public int getId_uzytkownika() {
		return useriD;
	}
	public void setId_uzytkownika(int id_uzytkownika) {
		this.useriD = id_uzytkownika;
	}
	@Override
	public String toString() {
		return "Event [id=" + id + ", name=" + name + ", startDate=" + startDate + ", ageRestriction=" + ageRestriction
				+ ", description=" + description + ", type=" + type + ", placeiD=" + placeiD + ", useriD=" + useriD
				+ "]";
	}
}
