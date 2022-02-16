package lesson5Pair2Workshop;

import DataAccess.concretes.JdbcCreditDao;
import business.CreditManager;
import core.BaseLogger;
import core.DatabaseLogger;
import core.FileLogger;
import entities.Credit;

public class Main {

	public static void main(String[] args) {
		
		Credit credit = new Credit(1, "Tarým Kredisi", 100000, 5000);
		
		CreditManager creditManager = new CreditManager(new JdbcCreditDao(),new BaseLogger[] {new FileLogger(), new DatabaseLogger()} );
		creditManager.save(credit);
		creditManager.update(credit);
		creditManager.delete(credit);
		System.out.println("/*******/");
		creditManager.creditApply(credit, 25000);
	}

}
