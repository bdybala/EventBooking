package data.person;

import java.util.Date;

import data.user.User;

public class Person extends User {
	
	private String firstName;
	private String lastName;
	private Date birthday;
	private String PESEL;
	
	public Person(int id, String login, String typ_uzytkownika) {
		super(id, login, typ_uzytkownika);
	}
	public Person(int id, String login, String typ_uzytkownika, String imie, String nazwisko,
			Date data_urodzenia, String pESEL) {
		super(id, login, typ_uzytkownika);
		this.firstName = imie;
		this.lastName = nazwisko;
		this.birthday = data_urodzenia;
		PESEL = pESEL;
	}
	
	public String getImie() {
		return firstName;
	}
	public void setImie(String imie) {
		this.firstName = imie;
	}
	public String getNazwisko() {
		return lastName;
	}
	public void setNazwisko(String nazwisko) {
		this.lastName = nazwisko;
	}
	public Date getData_urodzenia() {
		return birthday;
	}
	public void setData_urodzenia(Date data_urodzenia) {
		this.birthday = data_urodzenia;
	}
	public String getPESEL() {
		return PESEL;
	}
	public void setPESEL(String pESEL) {
		PESEL = pESEL;
	}
	
}
