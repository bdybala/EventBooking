package data.ticket;

public class Ticket {
	
	private int id;
	private Double value;
	private int sitNumber;		// nullable
	private int eventiD;
	private int useriD;			// nullable
	private int pooliD;
	
	public Ticket() {
	}
	public Ticket(int id_biletu, Double cena, int numer_miejsca, int id_imprezy, int id_uzytkownika, int id_puli) {
		this.id = id_biletu;
		this.value = cena;
		this.sitNumber = numer_miejsca;
		this.eventiD = id_imprezy;
		this.useriD = id_uzytkownika;
		this.pooliD = id_puli;
	}
	
	public int getId_biletu() {
		return id;
	}
	public void setId_biletu(int id_biletu) {
		this.id = id_biletu;
	}
	public Double getCena() {
		return value;
	}
	public void setCena(Double cena) {
		this.value = cena;
	}
	public int getNumer_miejsca() {
		return sitNumber;
	}
	public void setNumer_miejsca(int numer_miejsca) {
		this.sitNumber = numer_miejsca;
	}
	public int getId_imprezy() {
		return eventiD;
	}
	public void setId_imprezy(int id_imprezy) {
		this.eventiD = id_imprezy;
	}
	public int getId_uzytkownika() {
		return useriD;
	}
	public void setId_uzytkownika(int id_uzytkownika) {
		this.useriD = id_uzytkownika;
	}
	public int getId_puli() {
		return pooliD;
	}
	public void setId_puli(int id_puli) {
		this.pooliD = id_puli;
	}
	
}
