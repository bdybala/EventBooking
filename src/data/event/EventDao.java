package data.event;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import data.dao.DataAccessObject;

public class EventDao extends DataAccessObject {

	public Event getEventById(int id) {
		String sql = "SELECT id_imprezy, nazwa, "
				+ "date_to_epoch(data) \"data\", ograniczenie_wiekowe, "
				+ "opis, typ, id_uzytkownika, id_miejsca "
				+ "FROM impreza WHERE id_imprezy = " + id;
		
		Event ev = null;
		try {
			connectToDatabase();
			createPreparedStatement(sql);
			ResultSet rs = pStmt.executeQuery();
			ev = EventParser.parseEventFromResultSet(rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return ev;
	}
	
	public List<Event> getAllEvents() {
		String sql = "SELECT id_imprezy, nazwa, "
				+ "date_to_epoch(data) \"data\", ograniczenie_wiekowe, "
				+ "opis, typ, id_uzytkownika, id_miejsca "
				+ "FROM impreza";
		
		List<Event> eventList = null;
		try {
			connectToDatabase();
			createPreparedStatement(sql);
			ResultSet rs = pStmt.executeQuery();
			eventList = EventParser.parseEventListFromResultSet(rs);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closePreparedStatement();
			disconnectFromDatabase();
		}
		
		return eventList;
	}
	
	public int insertEvent(Event ev) {
		String sql = EventParser.makeInsertQuery(ev);
		int rows = 0;
		try {
			connectToDatabase();
			createPreparedStatement(sql);
			rows = pStmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closePreparedStatement();
			disconnectFromDatabase();
		}
		return rows;
	}
	
	public int updateEvent(int id, Integer ageRestriction, String desc,
			String name, Integer place, Long startDate, String type, Integer user) {
		String sql = EventParser.makeUpdateQuery(id, 
				ageRestriction, desc, name,	place, startDate, type, user);
		int rows = 0;
		
		try {
			connectToDatabase();
			createPreparedStatement(sql);
			rows = pStmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closePreparedStatement();
			disconnectFromDatabase();
		}
		
		return rows;
	}

}
