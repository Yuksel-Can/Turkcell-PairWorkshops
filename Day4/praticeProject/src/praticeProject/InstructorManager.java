package praticeProject;

public class InstructorManager {

	public void add(Instructor instructor) {
		System.out.println("Kategori eklendi: " + instructor.getFirstName() + " " + instructor.getLastName());
	}
	
	public void update(Instructor instructor) {
		System.out.println("Kategori güncellendi: " + instructor.getFirstName() + " " + instructor.getLastName());
	}
	
	public void delete(Instructor instructor) {
		System.out.println("Kategori silindi: " + instructor.getFirstName() + " " + instructor.getLastName());
	}
}
