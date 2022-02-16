package DataAccess.concretes;

import DataAccess.abstracts.CreditDao;
import entities.Credit;

public class JdbcCreditDao implements CreditDao{

	@Override
	public void save(Credit credit) {
		System.out.println("Kredi JDBC ile baþarýyla kaydedildi: " + credit.getName());
	}

	@Override
	public void update(Credit credit) {
		System.out.println("Kredi JDBC ile baþarýyla güncellendi: " + credit.getName());
		
	}

	@Override
	public void delete(Credit credit) {
		System.out.println("Kredi JDBC ile baþarýyla silindi: " + credit.getName());
		
	}
}
