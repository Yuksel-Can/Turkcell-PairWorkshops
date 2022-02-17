package lesson6Pair1Workshop1.dataAccess.concretes.HibernateImpls;

import lesson6Pair1Workshop1.dataAccess.abstracts.CourseDao;
import lesson6Pair1Workshop1.entities.concretes.Course;

public class HibernateCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Kurs Hibernate ile eklendi: " + course.getName());
		
	}

	@Override
	public void update(Course course) {
		System.out.println("Kurs Hibernate ile güncellendi: " + course.getName());
		
	}

	@Override
	public void delete(Course course) {
		System.out.println("Kurs Hibernate ile silindi: " + course.getName());
		
	}

}
