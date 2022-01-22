
public class InstructorManager {

	public void add(Instructor user) {
		System.out.println("Instructor added : " + user.getFirstName() + " " +  user.getLastName());
	}
	
	public void update(Instructor user) {
		System.out.println("Instructor updated : " + user.getFirstName() + " " +  user.getLastName());
	}
	
	public void delete(Instructor user) {
		System.out.println("Instructor deleted : " + user.getFirstName() + " " +  user.getLastName());
	}
}
