package lesson6Pair1Workshop1.dataAccess.concretes.JdbcImpls;

import lesson6Pair1Workshop1.dataAccess.abstracts.CourseDao;
import lesson6Pair1Workshop1.entities.concretes.Course;

public class JdbcCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Kurs JDBC ile eklendi: " + course.getName());
		
	}

	@Override
	public void update(Course course) {
		System.out.println("Kurs JDBC ile güncellendi: " + course.getName());
		
	}

	@Override
	public void delete(Course course) {
		System.out.println("Kurs JDBC ile silindi: " + course.getName());
		
	}

}
