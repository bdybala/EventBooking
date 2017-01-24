package data.eventPlace;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import data.dao.DataAccessObject;
import data.event.Event;
import data.event.EventParser;

public class EventPlaceDao extends DataAccessObject {

	public EventPlace getEventPlaceById(int id) {
		String sql = "SELECT * FROM miejsce_imprezy WHERE id_miejsca = " + id;
		
		EventPlace evP = null;
		try {
			connectToDatabase();
			createPreparedStatement(sql);
			ResultSet rs = pStmt.executeQuery();
			evP = EventPlaceParser.parseEventPlaceFromResultSet(rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return evP;
	}
	
	public List<EventPlace> getAllEventPlaces() {
		String sql = "SELECT * FROM miejsce_imprezy";
		
		List<EventPlace> eventPlaceList = null;
		try {
			connectToDatabase();
			createPreparedStatement(sql);
			ResultSet rs = pStmt.executeQuery();
			eventPlaceList = EventPlaceParser.parseEventListPlaceFromResultSet(rs);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closePreparedStatement();
			disconnectFromDatabase();
		}
		
		return eventPlaceList;
	}
	
	public int insertEvent(EventPlace evP) {
		String sql = EventPlaceParser.makeInsertQuery(evP);
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
	
	public int updateEvent(int id, String name, String address, String type, Integer capacity) {
		String sql = EventPlaceParser.makeUpdateQuery(id, name, address, type, capacity);
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
