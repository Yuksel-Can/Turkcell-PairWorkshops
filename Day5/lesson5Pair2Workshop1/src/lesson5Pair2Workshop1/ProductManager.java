package lesson5Pair2Workshop1;

public class ProductManager {

	ProductDao productDao;
	
	public ProductManager(ProductDao productDao) {
		
		this.productDao = productDao;
		
	}
	
	public void add(Product product) {
		this.productDao.add(product);
	}
	
	public void update(Product product) {
		this.productDao.update(product);
	}
	
	public void delete(Product product) {
		this.productDao.delete(product);
	}
}
