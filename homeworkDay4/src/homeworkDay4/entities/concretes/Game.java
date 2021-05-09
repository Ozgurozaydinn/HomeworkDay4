package homeworkDay4.entities.concretes;

import homeworkDay4.entities.abstracts.Entity;

public class Game implements Entity{
	//int id;
	String name;
	String description;
	double price;
	
	public Game() {}
	
	public Game(String name, String description, double price) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getId() {
		return name.toLowerCase()+"game";
	}
	
}
