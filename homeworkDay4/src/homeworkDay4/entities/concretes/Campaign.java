package homeworkDay4.entities.concretes;

import homeworkDay4.entities.abstracts.Entity;

public class Campaign implements Entity {
	
	private int id;
	private int discount;
	private String campaignName;
	
	public Campaign() {}
	
	public Campaign(int discount, String campaignName) {
		super();
		this.discount = discount;
		this.campaignName = campaignName;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public int getId() {
		return id;
	}
	
}
