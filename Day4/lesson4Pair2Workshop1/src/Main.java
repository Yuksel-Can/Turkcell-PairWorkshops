
public class Main {

	public static void main(String[] args) {
	
		Student student1 = new Student(1, "Yuksel","Can", "yukselcan@turkcell.com.tr", true);
		Student student2 = new Student(2, "Berkan","Muammer", "berkanmuammer@turkcell.com.tr", true);
		Student student3 = new Student(3, "Can","Aksu", "canaksu@turkcell.com.tr", true);
		
		
		Instructor instructor1 = new Instructor(1, "Engin", "Demirog", "engindemirog@turkcell.com.tr", "image1");
		Instructor instructor2 = new Instructor(1, "Sadık", "Turan", "engindemirog@turkcell.com.tr", "image2");
		Instructor instructor3 = new Instructor(1, "Mustafa", "Murat Coskun", "engindemirog@turkcell.com.tr","image3");
		
		Course course1 = new Course(1, "Java", "java_img.jpg");
		Course course2 = new Course(2, "C#", "csharp_img.jpg");
		Course course3 = new Course(3, "Python", "python_img.jpg");
		
		Category category1 = new Category(1, "Programlama");
		
		student1.setRegisteredCourses(new Course[] {course1, course2});
		student2.setRegisteredCourses(new Course[] {course2});
		student3.setRegisteredCourses(new Course[] {course3});
		Course[] courses = student1.getRegisteredCourses();
		
		User[]	users = {student1, student2, student3, instructor1, instructor2, instructor3};
		
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
		
		studentManager.add(student3);
		studentManager.update(student2);
		studentManager.delete(student1);
		studentManager.getCourseList(student1);
		System.out.println("/**********/");
		
		instructorManager.add(instructor1);
		instructorManager.update(instructor2);
		instructorManager.delete(instructor3);
		
		System.out.println("/**********/");
		
		instructor1.setCourses(new Course[] {course1,course2});
		instructor2.setCourses(new Course[] {course2});
		instructor3.setCourses(new Course[] {course2,course3});
		
		course1.setInstructors(new Instructor[] {instructor1});
		course2.setInstructors(new Instructor[] {instructor1, instructor2, instructor3});
		course3.setInstructors(new Instructor[] {instructor3});
		
		course1.setCategory(category1);
		course1.setCategory(category1);
		course1.setCategory(category1);
		
		category1.setCourses(new Course[] {course1, course2, course3});
		
		student1.setRegisteredCourses(new Course[] {course1,course2});
		student1.setRegisteredCourses(new Course[] {course2});
		student1.setRegisteredCourses(new Course[] {course2,course3});
		
		
	}
}
