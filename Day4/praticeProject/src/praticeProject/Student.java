package praticeProject;

import java.util.ArrayList;

public class Student extends User{

	private int certificateCount;

	private ArrayList<Course> registeredCourses;
	
	public Student() {
		super();
	}

	public Student(int id, String firstName, String lastName, String email, int certificateCount, ArrayList<Course> registerefCourses) {
		super(id, firstName, lastName, email);
		this.certificateCount = certificateCount;
		this.registeredCourses = registerefCourses;
	}

	public int getCertificateCount() {
		return certificateCount;
	}

	public void setCertificateCount(int certificateCount) {
		this.certificateCount = certificateCount;
	}
	
	@Override
	public String toString() {

		System.out.print("Öðrenci Ýd: " + this.getId() + ", Öðrenci Adý: " + this.getFirstName() + " " + this.getLastName() + " Öðrenci Mail: " + this.getEmail() + " Sertifika Sayýsý: " + this.certificateCount);
		this.getInstructorInformation();
		return "\n";
	}
	
	public void getInstructorInformation() {

		System.out.print(" , Kurslar: ");
		for(Course course : this.getRegisteredCourses()) {
			System.out.print(course.getName() + ", ");
		}
	}

	public ArrayList<Course> getRegisteredCourses() {
		return registeredCourses;
	}

	public void setRegisteredCourses(Course course) {
		registeredCourses.add(course);						//onemli
	}
}
