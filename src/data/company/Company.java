package data.company;

import data.user.User;

public class Company extends User {

	private String name;
	private String address;
	private String nip;
	
	public Company(int id, String login, String password, String type) {
		super(id, login, password, type);
	}

	public Company(int id, String login, String password, String type, String name, String address, String nip) {
		super(id, login, password, type);
		this.name = name;
		this.address = address;
		this.nip = nip;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNip() {
		return nip;
	}

	public void setNip(String nip) {
		this.nip = nip;
	}
	
	
}
