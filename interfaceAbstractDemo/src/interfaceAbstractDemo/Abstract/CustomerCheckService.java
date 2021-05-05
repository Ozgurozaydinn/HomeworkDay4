package interfaceAbstractDemo.Abstract;

import java.rmi.RemoteException;

import interfaceAbstractDemo.Entities.Customer;

public interface CustomerCheckService {
	boolean CheckIfRealPerson(Customer customer) throws RemoteException;
}
