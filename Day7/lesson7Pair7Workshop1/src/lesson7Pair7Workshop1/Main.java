package lesson7Pair7Workshop1;

import java.util.ArrayList;

import lesson7Pair7Workshop1.business.concretes.LoginManager;
import lesson7Pair7Workshop1.business.concretes.UserManager;
import lesson7Pair7Workshop1.dataAccess.concretes.HibernateImpls.HibernateUserDao;
import lesson7Pair7Workshop1.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<User> users = new ArrayList<User>();
		
		UserManager userManager = new UserManager(new HibernateUserDao(users), users);
		
		userManager.register(new User(1, "1Y", "OZDEMIR", "yuksel.can@gmail.com", "123456789"));					//firstNameLength
		userManager.register(new User(1, "2Yuksel Can", "OZ", "yuksel.can@gmail.com", "123456789"));				//lastNameLength
		userManager.register(new User(1, "3Yuksel Can", "OZDEMIR", "yuksel.cangmail.com", "123456789"));			//emailValidation
		userManager.register(new User(1, "4Yuksel Can", "OZDEMIR", "yuksel.can@gmail.com", "12345"));				//passwordLenth
		userManager.register(new User(1, "5Yuksel Can", "OZDEMIR", "yuksel.can@gmail.com", "123456789"));			//Valid User  +
		userManager.register(new User(1, "6Yuksel Can", "OZDEMIR", "yuksel.can@gmail.com", "123456789"));			//emailExist
		userManager.register(new User(1, "7Yuksel Can", "OZDEMIR", "yuksel.can7@gmail.com", "123456789"));			//Valid User2 +
		
		System.out.println("Registered Users: ");
		for(User user:users) {
			System.out.println(user.getFirstName() + " " + user.getLastName());
		}
		
		System.out.println("/**************/");
		
		LoginManager loginManager = new LoginManager(users);
		loginManager.login("yuksel@gmail.com", "123456789");
		loginManager.login("yuksel.can@gmail.com", "123");
		loginManager.login("yuksel.can@gmail.com", "123456789");
	}
}
