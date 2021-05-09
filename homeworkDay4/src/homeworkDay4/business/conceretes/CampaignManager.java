package homeworkDay4.business.conceretes;

import homeworkDay4.business.abstracts.CampaignService;
import homeworkDay4.entities.concretes.Campaign;
import homeworkDay4.entities.concretes.Game;

public class CampaignManager implements CampaignService {
	
	
	
	
	@Override
	public void buyWithCampaign(Game game, Campaign campaign) {
		System.out.println(game.getName().toUpperCase() + " oyununu " + campaign.getCampaignName().toUpperCase() + " kapsamýnda %" + campaign.getDiscount() + " indirimle satýn aldýnýz.");
		
	}

}
