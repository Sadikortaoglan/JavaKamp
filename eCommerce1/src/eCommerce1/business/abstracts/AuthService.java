package eCommerce1.business.abstracts;

import eCommerce1.entities.concretes.LoginDto;
import eCommerce1.entities.concretes.User;

public interface AuthService {
	
	void register(User user);
	void verify(User user,String token);
	boolean userExists(String email);
	void login(LoginDto dto);
	

}
