package lesson6Pair1Workshop1.dataAccess.abstracts;

import lesson6Pair1Workshop1.entities.concretes.Course;

public interface CourseDao {

	public void add(Course course);
	public void update(Course course);
	public void delete(Course course);
}
