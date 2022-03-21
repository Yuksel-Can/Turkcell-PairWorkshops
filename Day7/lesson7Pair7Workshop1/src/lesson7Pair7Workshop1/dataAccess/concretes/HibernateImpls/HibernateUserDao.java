package lesson7Pair7Workshop1.dataAccess.concretes.HibernateImpls;

import java.util.ArrayList;

import lesson7Pair7Workshop1.dataAccess.abstracts.UserDao;
import lesson7Pair7Workshop1.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	ArrayList<User> users;
	
	public HibernateUserDao(ArrayList<User> users) {
		this.users = users;
	}
	
	@Override
	public void register(User user) {
		users.add(user);
		System.out.println("Kullanýcý Hibernate ile baþarýyla kayýt edildi: " + user.getFirstName() + " " + user.getLastName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Kullanýcý Hibernate ile baþarýyla güncellendi: " + user.getFirstName() + " " + user.getLastName());
		
	}

	@Override
	public void delete(User user) {
		
		if(users.remove(user)) {
			System.out.println("Kullanýcý Hibernate ile baþarýyla silindi: " + user.getFirstName() + " " + user.getLastName());
		}else {
			System.out.println("Kullanýcý silme iþleminde hata oluþtu");
		}
	}

}
