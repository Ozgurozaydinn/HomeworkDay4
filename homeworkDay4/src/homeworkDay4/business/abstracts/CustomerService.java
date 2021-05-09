package homeworkDay4.business.abstracts;

import homeworkDay4.entities.concretes.Customer;
import homeworkDay4.entities.concretes.Game;

public interface CustomerService {
	void add(Customer customer);
	void update(Customer customer);
	void delete(Customer customer);
	void buy(Customer customer, Game game);
}
