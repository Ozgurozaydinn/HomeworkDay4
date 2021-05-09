package homeworkDay4.business.conceretes;

import homeworkDay4.entities.concretes.Customer;
import homeworkDay4.business.abstracts.CustomerCheckService;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		if(customer.getYearOfBirth()==2001) {
			return true;
		}else {
			return false;
		}
		
	}

}
