package eCommerce1.business.abstracts;

import java.util.List;

import eCommerce1.entities.concretes.User;

public interface UserService {
	
	void add(User user);
	void update(User user);
	void delete(int userId);
	User get(String email);
	List<User> getAll();
	
	
	
}
