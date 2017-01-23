package data.user;

import java.sql.ResultSet;
import java.sql.SQLException;

import data.dao.DataAccessObject;

public class UserDao extends DataAccessObject {

	User login(String login, String password) {
		
		String sqlQuery = "SELECT id_uzytkownika, login, haslo, typ_uzytkownika "
				+ "FROM uzytkownik "
				+ "WHERE login = " + login + " AND haslo = " + password;
		
		ResultSet rs = null;
		User u = null;
		try {
			connectToDatabase();
			createPreparedStatement(sqlQuery);
			rs = pStmt.executeQuery();
			u = UserParser.parseUserFromResultSet(rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return u;
	}

	User checkLogin(String login) {
		
		String sqlQuery = "SELECT id_uzytkownika, login, haslo, typ_uzytkownika "
				+ "FROM uzytkownik "
				+ "WHERE login = " + login;
		
		ResultSet rs = null;
		User u = null;
		try {
			connectToDatabase();
			createPreparedStatement(sqlQuery);
			rs = pStmt.executeQuery();
			u = UserParser.parseUserFromResultSet(rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return u;
	}

}
