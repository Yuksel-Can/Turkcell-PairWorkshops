package lesson6Pair1Workshop1;

import lesson6Pair1Workshop1.business.concretes.CourseManager;
import lesson6Pair1Workshop1.dataAccess.concretes.HibernateImpls.HibernateCourseDao;
import lesson6Pair1Workshop1.dataAccess.concretes.JdbcImpls.JdbcCourseDao;
import lesson6Pair1Workshop1.entities.concretes.Course;

public class Main {

	public static void main(String[] args) {

		Course course = new Course(1, "Java", 5000);
		CourseManager courseManager = new CourseManager(new HibernateCourseDao());
		
		courseManager.add(course);
		courseManager.update(course);
		courseManager.delete(course);
	}

}
