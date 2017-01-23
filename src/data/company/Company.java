package data.company;

import data.user.User;

public class Company extends User {

	private String name;
	private String address;
	private String NIP;
	
	public Company(int id, String login, String typ_uzytkownika) {
		super(id, login, typ_uzytkownika);
	}
	public Company(int id, String login, String typ_uzytkownika, String nazwa, String adres_siedziby, String nIP) {
		super(id, login, typ_uzytkownika);
		this.name = nazwa;
		this.address = adres_siedziby;
		NIP = nIP;
	}
	
	public String getNazwa() {
		return name;
	}
	public void setNazwa(String nazwa) {
		this.name = nazwa;
	}
	public String getAdres_siedziby() {
		return address;
	}
	public void setAdres_siedziby(String adres_siedziby) {
		this.address = adres_siedziby;
	}
	public String getNIP() {
		return NIP;
	}
	public void setNIP(String nIP) {
		NIP = nIP;
	}
	
}
