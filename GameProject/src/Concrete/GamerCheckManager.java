package Concrete;

import Abstract.GamerCheckService;
import Entities.Gamer;

public class GamerCheckManager implements GamerCheckService {

	@Override
	public boolean check(Gamer gamer) {
		if(gamer.getTc().equals("12545645")) {
		return true;
	}
	else {
		return false;
	}

}
}
