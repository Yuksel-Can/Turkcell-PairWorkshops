package lesson5Pair2Workshop1;

public class JdbcProductDao implements ProductDao{

	@Override
	public void add(Product product) {
		System.out.println("Ürün JDBC ile eklendi: " + product.getName());
	}

	@Override
	public void update(Product product) {
		System.out.println("Ürün JDBC ile güncellendi: " + product.getName());
		
	}

	@Override
	public void delete(Product product) {
		System.out.println("Ürün JDBC ile silindi: " + product.getName());
		
	}

}
