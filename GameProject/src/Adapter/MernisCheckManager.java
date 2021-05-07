package Adapter;

import java.rmi.RemoteException;

import com.sun.net.httpserver.Authenticator.Result;

import Abstract.GamerCheckService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisCheckManager implements GamerCheckService {

	
	@Override
	public boolean check(Gamer gamer) {
		KPSPublicSoapProxy client =new KPSPublicSoapProxy();
		boolean result;
		
		try {
			result= client.TCKimlikNoDogrula(gamer.getTc(), gamer.getFirstName(),
					gamer.getLastName(), gamer.getDateOfBirthDate());
		} catch (RemoteException e) {
			result=false;
			e.printStackTrace();
		}
		return result;
		
	}
	

}
