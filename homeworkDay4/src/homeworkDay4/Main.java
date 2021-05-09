package homeworkDay4;

import homeworkDay4.business.conceretes.CampaignManager;
import homeworkDay4.business.conceretes.CustomerCheckManager;
import homeworkDay4.business.conceretes.CustomerManager;
import homeworkDay4.dataAccess.concretes.HibernateCustomerDao;
import homeworkDay4.dataAccess.concretes.HibernateGameDao;
import homeworkDay4.entities.concretes.Campaign;
import homeworkDay4.entities.concretes.Customer;
import homeworkDay4.entities.concretes.Game;

public class Main {

	public static void main(String[] args) {
		Customer customer1 = new Customer("Özgür","Özaydýn","00000000000",2001);
		CustomerManager manager = new CustomerManager(new HibernateCustomerDao(), new CustomerCheckManager(), new HibernateGameDao());
		Game fifa21 = new Game("Fifa 21","Futbol Oyunu",140);
		Campaign campaign1 = new Campaign(20,"Yaz indirimi");
		CampaignManager campaignManager = new CampaignManager();
		manager.add(customer1);
		manager.delete(customer1);
		manager.update(customer1);
		manager.buy(customer1, fifa21);
		campaignManager.buyWithCampaign(fifa21, campaign1);
	}

}
