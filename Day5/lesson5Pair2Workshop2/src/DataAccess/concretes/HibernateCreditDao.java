package DataAccess.concretes;

import DataAccess.abstracts.CreditDao;
import entities.Credit;

public class HibernateCreditDao implements CreditDao{

	@Override
	public void save(Credit credit) {
		System.out.println("Kredi Hibarnate ile baþarýyla kaydedildi: " + credit.getName());
	}

	@Override
	public void update(Credit credit) {
		System.out.println("Kredi Hibarnate ile baþarýyla güncellendi: " + credit.getName());
		
	}

	@Override
	public void delete(Credit credit) {
		System.out.println("Kredi Hibarnate ile baþarýyla silindi: " + credit.getName());
		
	}

}
