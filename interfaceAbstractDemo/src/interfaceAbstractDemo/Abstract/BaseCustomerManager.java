package interfaceAbstractDemo.Abstract;


import java.rmi.RemoteException;

import interfaceAbstractDemo.Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public  void save(Customer customer) throws Exception {
		System.out.println("Saved to db : " + customer.getFirstName() + " " + customer.getLastName());
	}
	
}
