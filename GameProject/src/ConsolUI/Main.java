package ConsolUI;

import Concrete.GameManager;
import Concrete.GamerCheckManager;
import Concrete.GamerManager;
import Concrete.SellManager;
import Entities.*;


public class Main {

	public static void main(String[] args) {
		
		
		Gamer sadikGamer=new Gamer(1,"12545645","sadýk","ortaoglan");
		
		GamerManager gamerManager=new GamerManager(new GamerCheckManager());
		gamerManager.Add(sadikGamer);
		

	}

}
