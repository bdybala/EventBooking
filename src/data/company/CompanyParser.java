package data.company;

public class CompanyParser {

	public static String makeInsertQuery(String name, String address, String nip) {
		String sql = String.format("INSERT INTO firma VALUES("
				+ "'%s', '%s', %s, uzytkownik_seq.currval)", 
				name, address, nip);

		return sql;
	}
	
}
