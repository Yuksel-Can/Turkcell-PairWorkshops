package lesson6Pair1Workshop1.entities.concretes;

import lesson6Pair1Workshop1.entities.abstracts.Entity;

public class Course extends Entity{

	private int id;
	private String name;
	private double price;
	
	
	public Course() {
		super();
	}
	
	public Course(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
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
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
}
