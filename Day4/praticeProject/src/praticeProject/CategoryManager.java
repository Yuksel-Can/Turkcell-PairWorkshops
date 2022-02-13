package praticeProject;

public class CategoryManager {
	
	public void add(Category category) {
		System.out.println("Kategori eklendi: " + category.getName());
	}
	
	public void update(Category category) {
		System.out.println("Kategori güncellendi: " + category.getName());
	}
	
	public void delete(Category category) {
		System.out.println("Kategori silindi: " + category.getName());
	}
	
	public void registerCourse(Category category, Course[] course) {
		category.setCourse(course);
	}

}
