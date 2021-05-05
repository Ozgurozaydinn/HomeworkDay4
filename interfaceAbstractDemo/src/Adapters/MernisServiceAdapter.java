package Adapters;

import java.rmi.RemoteException;

import interfaceAbstractDemo.Abstract.CustomerCheckService;
import interfaceAbstractDemo.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.*;
public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer){
		boolean result; 
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy(); 
		try { 
			result = kpsPublicSoapProxy.TCKimlikNoDogrula(
					Long.parseLong(customer.getNationalityId()),					
					customer.getFirstName().toUpperCase(),
					customer.getLastName().toUpperCase(),
					customer.getDateOfBirth()); 
		}
	    catch (RemoteException e) { 
			result = false; 
			e.printStackTrace(); 
		}
		
		return result;
	}
	
}
