package praticeProject;

public class StudentManager {

	public void add(Student student) {
		System.out.println("Kategori eklendi: " + student.getFirstName() + " " + student.getLastName());
	}
	
	public void update(Student student) {
		System.out.println("Kategori güncellendi: " + student.getFirstName() + " " + student.getLastName());
	}
	
	public void delete(Student student) {
		System.out.println("Kategori silindi: " + student.getFirstName() + " " + student.getLastName());
	}
}
