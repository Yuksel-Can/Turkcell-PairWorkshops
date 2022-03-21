package lesson7Pair7Workshop1.dataAccess.abstracts;

import lesson7Pair7Workshop1.entities.concretes.User;

public interface UserDao {

	void register(User user);
	void update(User user);
	void delete(User user);
}
