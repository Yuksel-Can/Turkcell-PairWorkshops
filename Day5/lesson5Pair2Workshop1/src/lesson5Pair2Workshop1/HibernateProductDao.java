package lesson5Pair2Workshop1;

public class HibernateProductDao implements ProductDao{

	@Override
	public void add(Product product) {
		System.out.println("Ürün Hibernate ile eklendi: " + product.getName());
	}

	@Override
	public void update(Product product) {
		System.out.println("Ürün Hibernate ile güncellendi: " + product.getName());
		
	}

	@Override
	public void delete(Product product) {
		System.out.println("Ürün Hibernate ile silindi: " + product.getName());
		
	}

}
