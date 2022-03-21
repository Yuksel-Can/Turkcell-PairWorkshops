package lesson7Pair7Workshop1.business.concretes;

import java.util.ArrayList;

import lesson7Pair7Workshop1.business.abstracts.UserService;
import lesson7Pair7Workshop1.core.exceptions.BusinessException;
import lesson7Pair7Workshop1.dataAccess.abstracts.UserDao;
import lesson7Pair7Workshop1.entities.concretes.User;

public class UserManager implements UserService{

	UserDao userDao;
	ArrayList<User> registeredUser;
	
	public UserManager(UserDao userDao, ArrayList<User> registeredUser) {
		
		this.userDao = userDao;
		this.registeredUser = registeredUser;
	}
	
	@Override
	public void register(User user) {

		try {
			checkPasswordLength(user);
			checkEmailValid(user);
			checkEmailExist(user);
			checkFirstNameLength(user);
			checkLastNameLength(user);
			
			userDao.register(user);	
		
			
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Override
	public void update(User user) {

		userDao.update(user);
		
	}

	@Override
	public void delete(User user) {

		userDao.delete(user);
		
	}
	
	void checkPasswordLength(User user) throws BusinessException {
		if(!(user.getPassword().length()>5)) {
			throw new BusinessException("Kullanýcý Þifresi 6 karakterden kýsa olamaz: " + user.getFirstName() + " " + user.getLastName());
		}
	}
	
	void checkEmailValid(User user) throws BusinessException {
		if(!user.getEmail().contains("@")) {
			throw new BusinessException("Kullanýcý emaili geçersizdir: " + user.getFirstName() + " " + user.getLastName());
		}
	}

	void checkEmailExist(User user) throws BusinessException {
		for(User regUser: registeredUser) {
			if(regUser.getEmail() == user.getEmail()) {
				throw new BusinessException("Kullanýcý emaili daha önceden kayýt edilmiþ: " + user.getFirstName() + " " + user.getLastName() + ", email: " + user.getEmail());
			}
		}
	}
	
	void checkFirstNameLength(User user) throws BusinessException {
		if(!(user.getFirstName().length()>2)) {
			throw new BusinessException("Kullanýcý adý 2 karakterden kýsa olamaz: " + user.getFirstName() + " " + user.getLastName());
		}
	}
	
	void checkLastNameLength(User user) throws BusinessException {
		if(!(user.getLastName().length()>2)) {
			throw new BusinessException("Kullanýcý soyadý 2 karakterden kýsa olamaz: " + user.getFirstName() + " " + user.getLastName());
		}
	}

}
