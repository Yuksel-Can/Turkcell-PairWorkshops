
public class CourseManager {

	public void add(Course course) {
		System.out.println("Course added : " + course.getTitle());
	}
	
	public void addStudent(Student user) {
		System.out.println("Student : "+user.getFirstName() + " " + user.getLastName() + " added");
	}
	/*
	public Course[] getList(Course[] course){
		return course;
	}
	*/
}
