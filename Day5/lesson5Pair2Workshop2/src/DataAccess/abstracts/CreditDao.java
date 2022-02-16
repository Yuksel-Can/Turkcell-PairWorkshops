package DataAccess.abstracts;

import entities.Credit;

public interface CreditDao {

	public void save(Credit credit);
	public void update(Credit credit);
	public void delete(Credit credit);
	
}
