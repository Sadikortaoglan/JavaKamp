package eCommerce1.dataAccess.abstracts;

import java.util.List;

import eCommerce1.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void update(User user);
	void delete(int userId);
	List<User> getAll();
	User get(String email);
	
	

}
