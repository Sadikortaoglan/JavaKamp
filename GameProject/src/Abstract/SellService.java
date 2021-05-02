package Abstract;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface SellService {

	void Buy(Gamer gamer,Game game,Campaign campaign);
}
