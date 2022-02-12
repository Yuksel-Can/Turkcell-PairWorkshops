package praticeProject;

public class CourseManager {

	public void add(Course course) {
		System.out.println("Kategori eklendi: " + course.getName());
	}
	
	public void update(Course course) {
		System.out.println("Kategori güncellendi: " + course.getName());
	}
	
	public void delete(Course course) {
		System.out.println("Kategori silindi: " + course.getName());
	}
}
