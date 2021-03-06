package homeworkDay4.dataAccess.concretes;


import homeworkDay4.dataAccess.abstracts.CustomerDao;
import homeworkDay4.entities.concretes.Customer;

public class HibernateCustomerDao implements CustomerDao {
	
	
	@Override
	public void add(Customer customer) {
		System.out.println("Kullanıcı eklendi : " + customer.getFirstName().toUpperCase() + " " + customer.getLastName().toUpperCase());
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Kullanıcı güncellendi : " + customer.getFirstName().toUpperCase() + " " + customer.getLastName().toUpperCase());
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Kullanıcı silindi : " + customer.getFirstName().toUpperCase() + " " + customer.getLastName().toUpperCase());
		
	}
	
	
}
