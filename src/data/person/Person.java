package data.person;

import java.util.Date;

import data.user.User;

public class Person extends User {
	
	private String firstName;
	private String lastName;
	private Date birthday;
	private String address;
	private String pesel;
	
	public Person(int id, String login, String password, String type) {
		super(id, login, password, type);
	}

	public Person(int id, String login, String password, String type, String firstName, String lastName, Date birthday, String address,
			String pesel) {
		super(id, login, password, type);
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthday = birthday;
		this.address = address;
		this.pesel = pesel;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPesel() {
		return pesel;
	}

	public void setPesel(String pesel) {
		this.pesel = pesel;
	}
	
	
}
