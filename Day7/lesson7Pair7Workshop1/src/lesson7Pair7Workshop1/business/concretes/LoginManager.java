package lesson7Pair7Workshop1.business.concretes;

import java.util.ArrayList;
import java.util.Iterator;

import lesson7Pair7Workshop1.business.abstracts.LoginService;
import lesson7Pair7Workshop1.core.exceptions.BusinessException;
import lesson7Pair7Workshop1.entities.concretes.User;

public class LoginManager implements LoginService{

	ArrayList<User> users;
	
	public LoginManager(ArrayList<User> users) {
		this.users = users;
	}
	
	@Override
	public void login(String email, String password) {
		try {
			
			checkPasswordTrue(checkEmailExist(email), password);
			System.out.println("Sisteme giriþ baþarýyla gerçekleþti");
			
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		
	}

	String checkEmailExist(String email) throws BusinessException {
		for(User regesteredUser : users) {
			if(regesteredUser.getEmail()==email) {
				return regesteredUser.getPassword();
			}
		}
		throw new BusinessException("Girilen Email sisteme kayýtlý deðildir: " + email);
		
	}
	void checkPasswordTrue(String regesteredUserPassword, String entryPassword) throws BusinessException {
		if(regesteredUserPassword!=entryPassword) {
			throw new BusinessException("Girilen kullanýcý adý veya parola hatalýdýr:");
		}
	}
}
