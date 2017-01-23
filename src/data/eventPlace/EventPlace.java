package data.eventPlace;

public class EventPlace {

	private int id;
	private String name;
	private String type;
	private int capacity;			// nullable
	
	public EventPlace(int id_miejsca, String nazwa, String typ, int liczba_miejsc) {
		this.id = id_miejsca;
		this.name = nazwa;
		this.type = typ;
		this.capacity = liczba_miejsc;
	}
	public EventPlace() {
	}
	
	public int getId_miejsca() {
		return id;
	}
	public void setId_miejsca(int id_miejsca) {
		this.id = id_miejsca;
	}
	public String getNazwa() {
		return name;
	}
	public void setNazwa(String nazwa) {
		this.name = nazwa;
	}
	public String getTyp() {
		return type;
	}
	public void setTyp(String typ) {
		this.type = typ;
	}
	public int getLiczba_miejsc() {
		return capacity;
	}
	public void setLiczba_miejsc(int liczba_miejsc) {
		this.capacity = liczba_miejsc;
	}
}
