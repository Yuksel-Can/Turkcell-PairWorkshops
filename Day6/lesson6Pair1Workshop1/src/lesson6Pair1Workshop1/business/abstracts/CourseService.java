package lesson6Pair1Workshop1.business.abstracts;

import lesson6Pair1Workshop1.entities.concretes.Course;

public interface CourseService {

	void add(Course course);
	void update(Course course);
	void delete(Course course);
}
