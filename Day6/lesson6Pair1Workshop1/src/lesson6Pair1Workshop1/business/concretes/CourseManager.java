package lesson6Pair1Workshop1.business.concretes;

import lesson6Pair1Workshop1.business.abstracts.CourseService;
import lesson6Pair1Workshop1.dataAccess.abstracts.CourseDao;
import lesson6Pair1Workshop1.entities.concretes.Course;

public class CourseManager implements CourseService{

	CourseDao courseDao;
	
	public CourseManager(CourseDao courseDao) {
		this.courseDao = courseDao;
	}
	@Override
	public void add(Course course) {
		this.courseDao.add(course);
		
	}

	@Override
	public void update(Course course) {
		this.courseDao.update(course);
		
	}

	@Override
	public void delete(Course course) {
		this.courseDao.delete(course);
		
	}

}
