package data.ticket;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TicketParser {
	
	private static final String DB_ID = 		"id_biletu";
	private static final String DB_VALUE = 		"cena";
	private static final String DB_SIT = 		"numer_miejsca";
	private static final String DB_USER_ID = 	"id_uzytkownika";
	private static final String DB_EVENT_ID = 	"id_imprezy";
	private static final String DB_POOL_ID = 	"id_puli";

	static Ticket parseTicketFromResultSet(ResultSet rs) {
		Ticket t = null;
		
		try {
			if(rs.next()) {
				t = new Ticket();
				
				t.setId(			rs.getInt(		DB_ID));
				t.setValue((double) rs.getInt(		DB_VALUE));
				t.setSitNumber(		rs.getInt(		DB_SIT));
				t.setUseriD(		rs.getInt(		DB_USER_ID));
				t.setEventiD(		rs.getInt(		DB_EVENT_ID));
				t.setPooliD(		rs.getInt(		DB_POOL_ID));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return t;
	}

	static List<Ticket> parseTicketListFromResultSet(ResultSet rs) {
		List<Ticket> ticketList = new ArrayList<>();
		
		try {
			while(rs.next()) {
				Ticket t = new Ticket();
				
				t.setId(			rs.getInt(		DB_ID));
				t.setValue((double) rs.getInt(		DB_VALUE));
				t.setSitNumber(		rs.getInt(		DB_SIT));
				t.setUseriD(		rs.getInt(		DB_USER_ID));
				t.setEventiD(		rs.getInt(		DB_EVENT_ID));
				t.setPooliD(		rs.getInt(		DB_POOL_ID));
				
				ticketList.add(t);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ticketList;
	}

	static String makeInsertQuery(Ticket t) {
		String sql = String.format("INSERT INTO bilet VALUES("
				+ "bilet_seq.nextval, "
				+ "%s, %s, %s, %s, %s)", 
				t.getValue(), t.getSitNumber(), 
				t.getUseriD(), t.getEventiD(), t.getPooliD());
		
		return sql;
	}

	static String makeUpdateQuery(int ticketid, Double value, Integer sit, Integer user, Integer event,
			Integer pool) {
		
		String sql ="UPDATE bilet SET ";
		if(value != null) 			sql += "cena = " + 				value + ", ";
		if(sit != null) 			sql += "numer_miejsca = " + 	sit + ", ";
		if(user != null) 			sql += "id_uzytkownika = " + 	user + ", ";
		if(event != null) 			sql += "id_imprezy = " + 		event + ", ";
		if(pool != null) 			sql += "id_puli = " + 			pool + ", ";
		sql = sql.substring(0, sql.length()-2);
		sql += " WHERE id_biletu = " + ticketid;
		
		return sql;
	}

}
