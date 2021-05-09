package homeworkDay4.dataAccess.abstracts;

import homeworkDay4.entities.concretes.Customer;
import homeworkDay4.entities.concretes.Game;

public interface GameDao {
	void add(Game game);
	void update(Game game);
	void delete(Game game);
	void sell(Customer customer, Game game);
	
}
