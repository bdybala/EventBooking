package data.ticketsPool;

import java.util.Date;

public class TicketsPool {

	private int id;
	private int number;
	private Date emissionDate;
	
	public TicketsPool() {
	}
	public TicketsPool(int id_puli, int numer_puli, Date data_emisji) {
		this.id = id_puli;
		this.number = numer_puli;
		this.emissionDate = data_emisji;
	}
	
	public int getId_puli() {
		return id;
	}
	public void setId_puli(int id_puli) {
		this.id = id_puli;
	}
	public int getNumer_puli() {
		return number;
	}
	public void setNumer_puli(int numer_puli) {
		this.number = numer_puli;
	}
	public Date getData_emisji() {
		return emissionDate;
	}
	public void setData_emisji(Date data_emisji) {
		this.emissionDate = data_emisji;
	}
}
