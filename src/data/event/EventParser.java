package data.event;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EventParser {
	
	private static final String DB_ID = 				"id_imprezy";
	private static final String DB_NAME = 				"nazwa";
	private static final String DB_DATE = 				"data";
	private static final String DB_AGE_RESTRICTION = 	"ograniczenie_wiekowe";
	private static final String DB_DESC = 				"opis";
	private static final String DB_TYPE = 				"typ";
	private static final String DB_USER_ID = 			"id_uzytkownika";
	private static final String DB_PLACE = 				"miejsce";

	static Event parseEventFromResultSet(ResultSet rs) {
		Event ev = null;
		
		try {
			if(rs.next()) {
				ev = new Event();
				
				ev.setAgeRestriction(		rs.getInt(		DB_AGE_RESTRICTION));
				ev.setDescription(			rs.getString(	DB_DESC));
				ev.setId(					rs.getInt(		DB_ID));
				ev.setName(					rs.getString(	DB_NAME));
				ev.setPlace(				rs.getString(	DB_PLACE));
				ev.setStartDate(new Date(	rs.getLong(		DB_DATE)));
				ev.setType(					rs.getString(	DB_TYPE));
				ev.setUseriD(				rs.getInt(		DB_USER_ID));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ev;
	}

	static ArrayList<Event> parseEventListFromResultSet(ResultSet rs) {
		List<Event> eventList = new ArrayList<>();
		
		try {
			while(rs.next()) {
				Event ev = new Event();
				
				ev.setAgeRestriction(		rs.getInt(		DB_AGE_RESTRICTION));
				ev.setDescription(			rs.getString(	DB_DESC));
				ev.setId(					rs.getInt(		DB_ID));
				ev.setName(					rs.getString(	DB_NAME));
				ev.setPlace(				rs.getString(	DB_PLACE));
				ev.setStartDate(new Date(	rs.getLong(		DB_DATE)));
				ev.setType(					rs.getString(	DB_TYPE));
				ev.setUseriD(				rs.getInt(		DB_USER_ID));
				
				eventList.add(ev);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return (ArrayList<Event>) eventList;
	}

	static String makeInsertQuery(Event ev) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		String sql = String.format("INSERT INTO impreza VALUES("
				+ "impreza_seq.nextval, "
				+ "'%s', "
				+ "TO_DATE('%s','yyyy-mm-dd hh24:mi'), "
				+ "'%s', '%s', '%s', '%s', '%s')", 
				ev.getName(), sdf.format(ev.getStartDate()), ev.getAgeRestriction(),
				ev.getDescription(), ev.getType(), ev.getUseriD(), ev.getPlace());

		return sql;
	}

	static String makeUpdateQuery(int id, Integer ageRestriction, String desc, String name, String place,
			Long startDate, String type, Integer user) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		String sql ="UPDATE impreza SET ";
		if(ageRestriction != null) 	sql += "ograniczenie_wiekowe = " + 	ageRestriction + ", ";
		if(desc != null) 			sql += "opis = " + 					desc + ", ";
		if(name != null) 			sql += "nazwa = " + 				name + ", ";
		if(place != null) 			sql += "miejsce = " + 				place + ", ";
		if(startDate != null) 		sql += "data = TO_DATE('" + sdf.format(startDate) + "','yyyy-mm-dd hh24:mi'), ";
		if(type != null) 			sql += "typ = " + 					type + ", ";
		if(user != null) 			sql += "id_uzytkownika = " + 		user + ", ";
		sql = sql.substring(0, sql.length()-2);
		sql += " WHERE id_imprezy = " + id;
		
		return sql;
	}

}
