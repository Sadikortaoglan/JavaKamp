package ConsolUI;

import Adapter.MernisCheckManager;

import Concrete.GamerCheckManager;
import Concrete.GamerManager;
import Concrete.OrderManager;
import Entities.*;


public class Main {

	public static void main(String[] args) {
		
		
		//Gamer sadikGamer=new Gamer(1,50662825592L,"Sadýk","Ortaoðlan",1996);
		
		//GamerManager gamerManager=new GamerManager(new MernisCheckManager());
		//gamerManager.Add(sadikGamer);
		
		Order order=new Order(1,2,3,1,5,100,50,14);
		
		OrderManager orderManager=new OrderManager();
		orderManager.Add(order);
		
		

	}

}
