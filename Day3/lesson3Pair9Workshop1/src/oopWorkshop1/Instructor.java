package oopWorkshop1;

public class Instructor {
	
	private int id;
	private String firstName;
	private String lastName;
	private String image;
	
	private Course[] course;

	public Instructor() {
		super();
	}

	public Instructor(int id, String firstName, String lastName, String image) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.image = image;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Course[] getCourse() {
		return course;
	}

	public void setCourse(Course[] course) {
		this.course = course;
	}
	
	@Override
	public String toString() {

		System.out.print("Eðitmen Ýd: " + this.id + ", Eðitmen Adý: " + this.firstName + " " + this.lastName + " Eðitmen Resmi: " + this.image);
		this.getInstructorInformation();
		return "\n";
	}
	
	public void getInstructorInformation() {

		System.out.print(" , Kurslar: ");
		for(Course course : this.getCourse()) {
			System.out.print(course.getName() + ", ");
		}
	}
}
