package interfaceAbstractDemo;
import interfaceAbstractDemo.Abstract.BaseCustomerManager;
import interfaceAbstractDemo.Concrete.NeroCustomerManager;
import interfaceAbstractDemo.Concrete.StarbucksCustomerManager;
import interfaceAbstractDemo.Entities.Customer;
import Adapters.MernisServiceAdapter;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Customer customer1 = new Customer();
		customer1.setFirstName("Özgür");
		customer1.setLastName("Özaydýn");
		customer1.setNationalityId("00000000000");
		customer1.setDateOfBirth(2001);
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(customer1);
		
		
		
		
		
	
	}

}
