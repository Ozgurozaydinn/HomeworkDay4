package homeworkDay4.business.conceretes;

import homeworkDay4.entities.concretes.Customer;
import homeworkDay4.entities.concretes.Game;
import homeworkDay4.business.abstracts.CustomerCheckService;
import homeworkDay4.business.abstracts.CustomerService;
import homeworkDay4.dataAccess.abstracts.CustomerDao;
import homeworkDay4.dataAccess.abstracts.GameDao;

public class CustomerManager implements CustomerService{

	private CustomerCheckService customerCheckService;
	private CustomerDao customerDao;
	private GameDao gameDao;
	
	public CustomerManager(CustomerDao customerDao, CustomerCheckService customerCheckService, GameDao gameDao) {
		super();
		this.customerDao = customerDao;
		this.customerCheckService = customerCheckService;
		this.gameDao = gameDao;
	}
	
	@Override
	public void add(Customer customer) {
		if(customerCheckService.checkIfRealPerson(customer)) {
			customerDao.add(customer);
		}else {
			System.out.println("Hatalý kullanýcý bilgisi girildi.");
		}
	}

	@Override
	public void update(Customer customer) {
		customerDao.update(customer);
		
	}

	@Override
	public void delete(Customer customer) {
		customerDao.delete(customer);
		
	}
	
	@Override
	public void buy(Customer customer, Game game) {
		gameDao.sell(customer, game);
	}
	
}
