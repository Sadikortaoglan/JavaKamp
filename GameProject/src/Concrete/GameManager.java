package Concrete;
import Abstract.GameService;
import Abstract.GamerService;
import Entities.Game;
import Entities.Gamer;

public class GameManager implements GameService {

	@Override
	public void Add(Game game) {
		System.out.println("Game Eklendi : "+game.getName());
		
	}

	@Override
	public void Update(Game game) {
		System.out.println("Game Eklendi : "+game.getName());
		
	}

	@Override
	public void Delete(int gameId) {
		System.out.println("Game Eklendi : "+ gameId);
		
	}

	
}
