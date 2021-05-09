package homeworkDay4.dataAccess.concretes;

import homeworkDay4.dataAccess.abstracts.GameDao;
import homeworkDay4.entities.concretes.Customer;
import homeworkDay4.entities.concretes.Game;

public class HibernateGameDao implements GameDao {

	@Override
	public void add(Game game) {
		System.out.println("Oyun baþarýyla eklendi : " + game.getName());
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun baþarýyla güncellendi : " + game.getName());

		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun baþarýyla silindi : " + game.getName());

		
	}
	
	@Override
	public void sell(Customer customer,Game game) {
		System.out.println(customer.getFirstName() + " " + customer.getLastName() + " oyun kütüphaneye eklendi : " + game.getName());
	}
	

}
