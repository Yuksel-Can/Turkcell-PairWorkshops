package praticeProject;


public class Instructor extends User{
	
	private String image;

	private Course[] taughtCourses;

	public Instructor() {
		super();
	}
	
	public Instructor(int id, String firstName, String lastName, String email, String image) {
		super(id, firstName, lastName, email);
		this.image = image;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Course[] getTaughtCourses() {
		return taughtCourses;
	}

	public void setTaughtCourses(Course[] taughtCourses) {
		this.taughtCourses = taughtCourses;
	}
	
	@Override
	public String toString() {

		System.out.print("Eðitmen Ýd: " + this.getId() + ", Eðitmen Adý: " + this.getFirstName() + " " + this.getLastName() + " Öðrenci Mail: " + this.getEmail() + " Eðitmen Resmi: " + this.getImage());
		this.getInstructorInformation();
		return "\n";
	}
	
	public void getInstructorInformation() {

		System.out.print(" , Kurslar: ");
		for(Course course : this.getTaughtCourses()) {
			System.out.print(course.getName() + ", ");
		}
	}

}
