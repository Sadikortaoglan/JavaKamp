package Concrete;
import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void Add(Campaign campaign) {
		System.out.println("Kampanya eklendi   : "+campaign.getName());
		
	}

	@Override
	public void Update(Campaign campaign) {
		System.out.println("Kampanya Güncellendi   : "+campaign.getName());
		
	}

	@Override
	public void Delete(int campaignId) {
		System.out.println("Kampanya Silindi   : "+campaignId);
		
	}

}
