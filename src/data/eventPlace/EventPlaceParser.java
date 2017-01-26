package data.eventPlace;
 
 import java.sql.ResultSet;
 import java.sql.SQLException;
 import java.text.SimpleDateFormat;
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.List;
 
 import data.event.Event;
 
 public class EventPlaceParser {
 	private static final String DB_ID= "id_miejsca";
 	private static final String DB_NAME = "nazwa";
 	private static final String DB_ADR = "adres";
 	private static final String DB_TYPE = "typ";
 	private static final String DB_CAP = "liczba_miejsc";
 	
 	static EventPlace parseEventPlaceFromResultSet(ResultSet rs) {
 		EventPlace evP = null;
 		
 		try {
 			if(rs.next()) {
 				evP = new EventPlace();
 				
 				evP.setId(						rs.getInt(		DB_ID));
 				evP.setName(					rs.getString(	DB_NAME));
 				evP.setAddress(					rs.getString(	DB_ADR));
 				evP.setType(					rs.getString(	DB_TYPE));
 				evP.setCapacity(				rs.getInt(		DB_CAP));
 			}
 		} catch (SQLException e) {
 			e.printStackTrace();
 		}
 		return evP;
 	}
 	
 	static List<EventPlace> parseEventListPlaceFromResultSet(ResultSet rs) {
 		List<EventPlace> eventPlaceList = new ArrayList<>();
 		EventPlace evP = null;
 		try {
 			if(rs.next()) {
 				evP = new EventPlace();
 				
 				evP.setId(						rs.getInt(		DB_ID));
 				evP.setName(					rs.getString(	DB_NAME));
 				evP.setAddress(					rs.getString(	DB_ADR));
 				evP.setType(					rs.getString(	DB_TYPE));
 				evP.setCapacity(				rs.getInt(		DB_CAP));
 				
 				eventPlaceList.add(evP);
 			}
 		} catch (SQLException e) {
 			e.printStackTrace();
 		}
 		return eventPlaceList;
 	}
 	
 	static String makeInsertQuery(EventPlace evP) {
 		String sql = String.format("INSERT INTO impreza VALUES("
 				+ "'%s', '%s', '%s', '%s', '%s')", 
 				evP.getId(), evP.getName(), evP.getAddress(),
 				evP.getType(), evP.getCapacity());
 
 		return sql;
 	}
 	
 	static String makeUpdateQuery(int id, String name, String address, String type, Integer capacity) {
 		String sql ="UPDATE impreza SET ";
 		if(name != null) 					sql += "nazwa = " + 				name + ", ";
 		if(address != null) 				sql += "adres = " + 				address + ", ";
 		if(type != null) 					sql += "typ = " + 					type + ", ";
 		if(capacity != null) 				sql += "liczba_miejsc = " + 		capacity + ", ";
 	
 		sql = sql.substring(0, sql.length() - 2);
 		sql += " WHERE id_miejsca = " + id;
 		
 		return sql;
 	}
 
 }