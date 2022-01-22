
public class Instructor extends User{

	private String image;
	
	private Course[] courses;		//eðitim verilen kurslar
	
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
	
	public Course[] getCourses() {
		return courses;
	}

	public void setCourses(Course[] trainingCourses) {
		this.courses = trainingCourses;
	}
}
