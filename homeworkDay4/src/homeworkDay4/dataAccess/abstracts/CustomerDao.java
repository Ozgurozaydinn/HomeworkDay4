package homeworkDay4.dataAccess.abstracts;

import homeworkDay4.entities.concretes.Customer;

public interface CustomerDao {
	void add(Customer customer);
	void update(Customer customer);
	void delete(Customer customer);
}
