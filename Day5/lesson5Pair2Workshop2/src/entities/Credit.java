package entities;

public class Credit {

	private int id;
	private String name;
	private double maxCreditLimit;
	private double minCreditLimit;
	
	
	public Credit() {
		super();
	}
	
	public Credit(int id, String name, double maxCreditLimit, double minCreditLimit) {
		super();
		this.id = id;
		this.name = name;
		this.maxCreditLimit = maxCreditLimit;
		this.minCreditLimit = minCreditLimit;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getMaxCreditLimit() {
		return maxCreditLimit;
	}
	
	public void setMaxCreditLimit(double maxCreditLimit) {
		this.maxCreditLimit = maxCreditLimit;
	}
	
	public double getMinCreditLimit() {
		return minCreditLimit;
	}
	
	public void setMinCreditLimit(double minCreditLimit) {
		this.minCreditLimit = minCreditLimit;
	}
	
}
