package data.user;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserParser {

	private static final String DB_ID = 		"id_uzytkownika";
	private static final String DB_LOGIN = 		"login";
//	private static final String DB_PASSWORD = 	"haslo";
	private static final String DB_TYPE= 		"typ_uzytkownika";
	
	public static User parseUserFromResultSet(ResultSet rs) {
		User u = null;
		try {
			if(rs.next()) {
				u = new User();
				
				u.setId(				rs.getInt(		DB_ID));
				u.setLogin(				rs.getString(	DB_LOGIN));
				u.setTyp_uzytkownika(	rs.getString(	DB_TYPE));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return u;
	}

	
}
