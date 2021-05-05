package interfaceAbstractDemo.Concrete;

import interfaceAbstractDemo.Abstract.BaseCustomerManager;
import interfaceAbstractDemo.Abstract.CustomerCheckService;
import interfaceAbstractDemo.Abstract.CustomerService;
import interfaceAbstractDemo.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager implements CustomerService {
	
	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void save(Customer customer) throws Exception {
		if(this.customerCheckService.CheckIfRealPerson(customer)) {
			super.save(customer);
		}else {
			System.out.println("Not a valid person");
		}
	}
	
}
