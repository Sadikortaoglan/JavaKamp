package Concrete;

import Abstract.SellService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SellManager implements SellService{

	@Override
	public void Buy(Gamer gamer, Game game, Campaign campaign) {
		System.out.println(gamer.getFirstName()+"Kütüphaneye Eklendi : "+game.getName()+"Kampanya "+ campaign.getName());
		
	}

}
