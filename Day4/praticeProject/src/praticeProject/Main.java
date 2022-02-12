package praticeProject;


public class Main {

	public static void main(String[] args) {
		
		//pratic for lesson4Pair2Workshop1 
		
		Category category1 = new Category(1, "Programlama");
		Category category2 = new Category(2,  "Güvenlik");
		Category category3 = new Category(3,  "Gizlilik");

		Instructor instructor1 = new Instructor(1, "Engin", "Demiroð", "engin.demirog@gmail.com", "image1.jgp");
		Instructor instructor2 = new Instructor(2, "Mustafa Murat", "Coþkun", "mustafa.murat@gmail.com", "image1.jpg");
		Instructor instructor3 = new Instructor(3, "Sadýk", "Turan", "sadik.turan@gmail.com", "image1.jpg");

		Student student1 = new Student(1, "Yüksel Can", "ÖZDEMÝR", "can.yuksel@gmail.com", 5);
		Student student2 = new Student(2, "Yasin", "Haklý", "hakli.yasin@gmail.com", 3);
		Student student3 = new Student(3, "Günateþi", "Tutulmaz", "tutulmaz.gunatesi@gmail.com", 1);
		
		Course course1 = new Course(1, "Java", "Java eðitimidir", "image_j.jpg", category1);
		Course course2 = new Course(2, "C#", "C# eðitimidir", "image_c.jpg", category2);
		Course course3 = new Course(3, "JavaScript", "JavaScript eðitimidir", "image_js.jpg", category3);
		
		course1.setInstructors(new Instructor[] {instructor1});
		course2.setInstructors(new Instructor[] {instructor1, instructor3});
		course3.setInstructors(new Instructor[] {instructor2});
		
		course1.setStudents(new Student[] {student1});
		course2.setStudents(new Student[] {student1, student2});
		course3.setStudents(new Student[] {student1, student3});
		
		category1.setCourse(new Course[] {course1});
		category2.setCourse(new Course[] {course2});
		category3.setCourse(new Course[] {course3});
		
		instructor1.setTaughtCourses(new Course[] {course1, course2});
		instructor2.setTaughtCourses(new Course[] {course3});
		instructor3.setTaughtCourses(new Course[] {course2});
		
		student1.setRegisteredCourses(new Course[] {course1, course2, course3});
		student2.setRegisteredCourses(new Course[] {course2});
		student3.setRegisteredCourses(new Course[] {course3});
		

		System.out.println("/********************************/");
		
		System.out.println(course1);
		System.out.println(course2);
		System.out.println(course3);

		System.out.println("/********************************/");
	
		System.out.print(category1);
		System.out.print(category2);
		System.out.print(category3);

		System.out.println("/********************************/");
		
		System.out.print(instructor1);
		System.out.print(instructor2);
		System.out.print(instructor3);

		System.out.println("/********************************/");
		
		System.out.print(student1);
		System.out.print(student2);
		System.out.print(student3);
	}

}
