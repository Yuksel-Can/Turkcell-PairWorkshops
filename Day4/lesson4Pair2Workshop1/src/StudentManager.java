
public class StudentManager {

	public void add(Student user) {
		System.out.println("Student added : " + user.getFirstName() + " " + user.getLastName());
	}
	
	public void update(Student user) {
		System.out.println("Student updated : " + user.getFirstName() + " " +  user.getLastName());
	}
	
	public void delete(Student user) {
		System.out.println("Student deleted : " + user.getFirstName() + " " +  user.getLastName());
	}
	
	public void getCourseList(Student user) {
		
		Course[] courses = user.getRegisteredCourses();
		for (Course course : courses) {
			System.out.println(course);
		}
	}
}
