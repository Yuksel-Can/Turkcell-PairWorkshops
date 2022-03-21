package lesson7Pair7Workshop1.business.abstracts;

import lesson7Pair7Workshop1.entities.concretes.User;

public interface UserService {

	public void register(User user);
	public void update(User user);
	public void delete(User user);
}
