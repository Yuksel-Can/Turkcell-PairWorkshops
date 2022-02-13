package praticeProject;

import java.util.Iterator;

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
	
	
	public void registerInstructor(Course course, Instructor[] instructors) {
		
		course.setInstructors(instructors);							//kurs icine egitmen atildi
		/**/
		for(Instructor instructor : instructors) {
			instructor.setTaughtCourses(course);					//egitmen icine kurs atildi
		}
		
	}

	public void registerStudent(Course course, Student[] students) {
		
		course.setStudents(students);
		/**/
		for(Student student : students) {
			student.setRegisteredCourses(course);
		}
	}
	
	
	
}
