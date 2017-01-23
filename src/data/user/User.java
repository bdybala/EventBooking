package data.user;

public class User {
	
	protected int id;
	protected String login;
	protected String type;
	
	public User(int id, String login, String type) {
		this.id = id;
		this.login = login;
		this.type = type;
	}
	public User() {
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getTyp_uzytkownika() {
		return type;
	}
	public void setTyp_uzytkownika(String typ_uzytkownika) {
		this.type = typ_uzytkownika;
	}
	
}
