package data.person;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class PersonParser {
	public static String makeInsertQuery(String firstName, String lastName, Date dateOfBirth, 
			String address, String pesel) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		String sql = String.format("INSERT INTO osoba VALUES("
				+ "'%s', '%s', TO_DATE('%s','yyyy-mm-dd hh24:mi'), "
				+ "'%s', '%s', uzytkownik_seq.currval)", 
				firstName, lastName, sdf.format(dateOfBirth), address, pesel);

		return sql;
	}
}
