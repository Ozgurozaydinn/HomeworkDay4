package homeworkDay4.entities.concretes;

import homeworkDay4.entities.abstracts.Entity;

public class Customer implements Entity {
	//private int id;
	private String firstName;
	private String lastName;
	private String nationalityId;
	private int yearOfBirth;
	
	public Customer() {}
	
	public Customer(String firstName, String lastName, String nationalityId, int yearOfBirth) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		this.yearOfBirth = yearOfBirth;
	}

	public String getId() {
		return yearOfBirth+firstName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
}
