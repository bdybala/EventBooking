package data.person;

import java.sql.Date;
import java.sql.SQLException;

import data.dao.DataAccessObject;
import data.user.UserParser;

public class PersonDao extends DataAccessObject {
	public int registerPerson(String login, String password, String type, String firstName, 
			String lastName, Date dateOfBirth, String address, String pesel) {
		
		String sqlUser = UserParser.makeInsertQuery(login, password, type);
		String sqlPerson = PersonParser.makeInsertQuery(firstName, lastName, dateOfBirth, address, pesel);
		int rows = 0;
		System.out.println(sqlUser);
		System.out.println(sqlPerson);
		try {
			connectToDatabase();
			createPreparedStatement(sqlUser);
			rows = pStmt.executeUpdate();
			createPreparedStatement(sqlPerson);
			rows += pStmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closePreparedStatement();
			disconnectFromDatabase();
		}
		return rows;
	}
}
