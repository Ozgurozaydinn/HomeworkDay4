package homeworkDay4.dataAccess.concretes;

import homeworkDay4.dataAccess.abstracts.CampaignDao;

public class HibernateCampaignDao implements CampaignDao{

	@Override
	public void add(String massage) {
		System.out.println("Kampanya eklendi : " + massage);
		
	}

	@Override
	public void update(String massage) {
		System.out.println("Kampanya güncellendi : " + massage);
		
	}

	@Override
	public void delete(String massage) {
		System.out.println("Kampanya silindi : " + massage);
		
	}
	
}
