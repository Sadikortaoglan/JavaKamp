package Concrete;
import Abstract.GamerCheckService;
import Abstract.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService {
	
	private GamerCheckService gamerCheckService;

	public GamerManager(GamerCheckService gamerCheckService) {
		super();
		this.gamerCheckService = gamerCheckService;
	}

	
	@Override
	public void Add(Gamer gamer) {
		if(gamerCheckService.check(gamer)) {
			System.out.println("Gamer Eklendi : "+gamer.getFirstName());
		}
		else {
			System.out.println("Bilgilerinizi Kontrol Ediniz.");
		}
		
	}

	@Override
	public void Update(Gamer gamer) {
		System.out.println("Gamer Güncellendi : "+gamer.getFirstName());
		
	}

	@Override
	public void Delete(int gamerId) {
		System.out.println("Gamer Silindi : "+gamerId);
		
	}

}
