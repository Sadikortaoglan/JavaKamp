package Abstract;
import Entities.Gamer;

public interface GamerService {
	void Add(Gamer gamer);
	void Update(Gamer gamer);
	void Delete(int gamerId);

}
