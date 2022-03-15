package entities;

import java.util.Date;

public class Campaign {
	private int id;
	private String campaignName;
	private Date startTime;
	private Date finishTime;
	private int discount;
	
	public Campaign() {
		
	}

	public Campaign(int id, String campaignName, Date startTime, Date finishTime, int discount) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.startTime = startTime;
		this.finishTime = finishTime;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getFinishTime() {
		return finishTime;
	}

	public void setFinishTime(Date finishTime) {
		this.finishTime = finishTime;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	
}
