package data.ticket;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import data.dao.DataAccessObject;

public class TicketDao extends DataAccessObject {

	public Ticket getTicketById(int id) {
		String sql = "SELECT * FROM bilet WHERE id_biletu = " + id;
		
		Ticket t = null;
		
		try {
			connectToDatabase();
			createPreparedStatement(sql);
			ResultSet rs = pStmt.executeQuery();
			t = TicketParser.parseTicketFromResultSet(rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return t;
	}
	
	public List<Ticket> getAllTickets() {
		String sql = "SELECT * FROM bilet";
		List<Ticket> ticketList = null;
		
		try {
			connectToDatabase();
			createPreparedStatement(sql);
			ResultSet rs = pStmt.executeQuery();
			ticketList = TicketParser.parseTicketListFromResultSet(rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ticketList;
	}
	
	public List<Ticket> getUserTickets(int userid) {
		String sql = "SELECT * FROM bilet WHERE id_uzytkownika = " + userid;
		List<Ticket> ticketList = null;
		
		try {
			connectToDatabase();
			createPreparedStatement(sql);
			ResultSet rs = pStmt.executeQuery();
			ticketList = TicketParser.parseTicketListFromResultSet(rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ticketList;
	}
	
	public int insertTicket(Ticket t) {
		String sql = TicketParser.makeInsertQuery(t);
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
	
	public int updateTicket(int ticketid, Double value, Integer sit,
			Integer user, Integer event, Integer pool) {
		String sql = TicketParser.makeUpdateQuery(ticketid, value, sit, user, event, pool);
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
