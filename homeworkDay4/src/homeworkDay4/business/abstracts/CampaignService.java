package homeworkDay4.business.abstracts;

import homeworkDay4.entities.concretes.Campaign;
import homeworkDay4.entities.concretes.Game;

public interface CampaignService {
	void buyWithCampaign(Game game,Campaign campaign);
}
