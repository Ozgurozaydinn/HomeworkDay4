package homeworkDay4.business.abstracts;

import homeworkDay4.entities.concretes.Customer;

public interface CustomerCheckService {
	boolean checkIfRealPerson(Customer customer);
}
