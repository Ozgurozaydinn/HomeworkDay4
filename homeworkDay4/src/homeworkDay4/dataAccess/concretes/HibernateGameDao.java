package homeworkDay4.dataAccess.concretes;

import homeworkDay4.dataAccess.abstracts.GameDao;
import homeworkDay4.entities.concretes.Customer;
import homeworkDay4.entities.concretes.Game;

public class HibernateGameDao implements GameDao {

	@Override
	public void add(Game game) {
		System.out.println("Oyun ba�ar�yla eklendi : " + game.getName());
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun ba�ar�yla g�ncellendi : " + game.getName());

		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun ba�ar�yla silindi : " + game.getName());

		
	}
	
	@Override
	public void sell(Customer customer,Game game) {
		System.out.println(customer.getFirstName() + " " + customer.getLastName() + " oyun k�t�phaneye eklendi : " + game.getName());
	}
	

}
