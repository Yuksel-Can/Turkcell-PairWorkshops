package business;

import java.util.Iterator;

import DataAccess.abstracts.CreditDao;
import core.BaseLogger;
import entities.Credit;

public class CreditManager {
	
	CreditDao creditDao;
	BaseLogger[] baseLogger;
	
	public CreditManager(CreditDao creditDao, BaseLogger[] baseLogger) {
		this.creditDao = creditDao;
		this.baseLogger = baseLogger;
	}
	
	public void save(Credit credit) {
		this.creditDao.save(credit);
		logRun(baseLogger, "kaydetme loglandý");
	}
	
	public void update(Credit credit) {
		this.creditDao.update(credit);
		logRun(baseLogger, "güncelleme loglandý");
	}
	
	public void delete(Credit credit) {
		this.creditDao.delete(credit);
		logRun(baseLogger, "silme loglandý");
	}
	
	public void creditApply(Credit credit, double claimAmount) {
		if(claimAmount<credit.getMinCreditLimit()) {
			System.out.println("Talep edilen tutar çok düþüktür");
		}else if(claimAmount>credit.getMaxCreditLimit()) {
			System.out.println("Talep edilen tutar çok fazladýr");
		}else {
			System.out.println("Talebiniz baþarýyla alýnmýþtýr, Tutar: " + claimAmount + ", Kredi: " + credit.getName());
			logRun(baseLogger, "Kredi talebi loglandý");
		}
	}
	
	public void logRun(BaseLogger[] loggers, String message) {
		for(BaseLogger logger : loggers) {
			logger.log(message);
		}
	}

}
