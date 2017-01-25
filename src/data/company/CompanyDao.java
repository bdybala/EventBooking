package data.company;

import java.sql.SQLException;

import data.dao.DataAccessObject;
import data.user.UserParser;


public class CompanyDao extends DataAccessObject {
	public int registerCompany(String login, String password, String type, String name, String address, String nip) {
		String sqlUser = UserParser.makeInsertQuery(login, password, type);
		String sqlCompany = CompanyParser.makeInsertQuery(name, address, nip);
		int rows = 0;
		System.out.println(sqlUser);
		System.out.println(sqlCompany);
		try {
			connectToDatabase();
			createPreparedStatement(sqlUser);
			rows = pStmt.executeUpdate();
			createPreparedStatement(sqlCompany);
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
