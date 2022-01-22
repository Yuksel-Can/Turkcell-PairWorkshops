
public class Student extends User{

	private boolean validation;
	
	private Course[] registeredCourses;	//kayýtlý kurslar

	public Student() {
		super();
	}

	public Student(int id, String firstName, String lastName, String email, boolean validation) {
		super(id, firstName, lastName, email);
		this.validation = validation;
	}

	public boolean isValidation() {
		return validation;
	}

	public void setValidation(boolean validation) {
		this.validation = validation;
	}

	public Course[] getRegisteredCourses() {
		return registeredCourses;
	}

	public void setRegisteredCourses(Course[] registeredCourses) {
		this.registeredCourses = registeredCourses;
	}
	
}
