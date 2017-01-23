package data.ticket;

public class Ticket {
	
	private int id;
	private Double value;
	private int sitNumber;		// nullable
	private int eventiD;
	private int useriD;			// nullable
	private int pooliD;
	
	public Ticket() {
	}

	public Ticket(int id, Double value, int sitNumber, int eventiD, int useriD, int pooliD) {
		this.id = id;
		this.value = value;
		this.sitNumber = sitNumber;
		this.eventiD = eventiD;
		this.useriD = useriD;
		this.pooliD = pooliD;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public int getSitNumber() {
		return sitNumber;
	}

	public void setSitNumber(int sitNumber) {
		this.sitNumber = sitNumber;
	}

	public int getEventiD() {
		return eventiD;
	}

	public void setEventiD(int eventiD) {
		this.eventiD = eventiD;
	}

	public int getUseriD() {
		return useriD;
	}

	public void setUseriD(int useriD) {
		this.useriD = useriD;
	}

	public int getPooliD() {
		return pooliD;
	}

	public void setPooliD(int pooliD) {
		this.pooliD = pooliD;
	}
	
}
