package lesson5Pair2Workshop1;

public class Main {

	public static void main(String[] args) {

		Product product = new Product(1, "Kalem", 36, 6, new String[] {});
		
		ProductManager productManager = new ProductManager(new HibernateProductDao());
		
		productManager.add(product);
		productManager.update(product);
		productManager.delete(product);
	}

}
