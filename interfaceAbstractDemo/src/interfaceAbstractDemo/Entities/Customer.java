package interfaceAbstractDemo.Entities;
//import java.util.Date;
import interfaceAbstractDemo.Abstract.Entity;

public class Customer implements Entity{
	//private int id;
	private String firstName;
	private String lastName;
	private int dateOfBirth;
	private String nationalityId;
	
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
	public int getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	public String getId() {
		return this.firstName+this.lastName;
	}
}
