package data.ticketsPool;

import java.util.Date;

public class TicketsPool {

	private int id;
	private int number;
	private Date emissionDate;
	
	public TicketsPool() {
	}

	public TicketsPool(int id, int number, Date emissionDate) {
		this.id = id;
		this.number = number;
		this.emissionDate = emissionDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Date getEmissionDate() {
		return emissionDate;
	}

	public void setEmissionDate(Date emissionDate) {
		this.emissionDate = emissionDate;
	}
	
	
	
}
