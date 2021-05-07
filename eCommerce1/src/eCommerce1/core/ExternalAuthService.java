package eCommerce1.core;

import eCommerce1.entities.concretes.LoginDto;

public interface ExternalAuthService {
	
	void register(String email);
	boolean userExists(String email);
	void login(LoginDto dto);
	

}
