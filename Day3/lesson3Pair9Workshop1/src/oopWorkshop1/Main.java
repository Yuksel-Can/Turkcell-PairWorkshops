package oopWorkshop1;

public class Main {

	public static void main(String[] args) {

		Category category1 = new Category(1, "Programlama");
		Category category2 = new Category(2,  "Güvenlik");
		Category category3 = new Category(3,  "Gizlilik");

		Instructor instructor1 = new Instructor(1, "Engin", "Demiroð", "image1.jgp");
		Instructor instructor2 = new Instructor(2, "Mustafa Murat", "Coþkun", "image1.jpg");
		Instructor instructor3 = new Instructor(3, "Sadýk", "Turan", "image1.jpg");
		
		Course course1 = new Course(1, "Java", "Java eðitimidir", "image_j.jpg");
		Course course2 = new Course(2, "C#", "C# eðitimidir", "image_c.jpg");
		Course course3 = new Course(3, "JavaScript", "JavaScript eðitimidir", "image_js.jpg");
		
		course1.setCategory(new Category[]{category1});
		course2.setCategory(new Category[]{category1, category2});
		course3.setCategory(new Category[]{category3});
		
		course1.setInstructor(new Instructor[] {instructor1});
		course2.setInstructor(new Instructor[] {instructor1, instructor3});
		course3.setInstructor(new Instructor[] {instructor2});
		
		category1.setCourse(new Course[] {course1, course2});
		category2.setCourse(new Course[] {course2});
		category3.setCourse(new Course[] {course3});
		
		instructor1.setCourse(new Course[] {course1, course2});
		instructor2.setCourse(new Course[] {course3});
		instructor3.setCourse(new Course[] {course2});
		
		
		System.out.print(course1);
		for(Instructor instructor : course1.getInstructor()) {
			System.out.print(" Eðitmenler: " + instructor.getFirstName() + " " + instructor.getLastName());
		}
		System.out.println("");
		System.out.print(course2);
		for(Instructor instructor : course2.getInstructor()) {
			System.out.print(" Eðitmenler: " + instructor.getFirstName() + " " + instructor.getLastName());
		}	
		System.out.println("");
		System.out.print(course3);
		for(Instructor instructor : course3.getInstructor()) {
			System.out.print(" Eðitmenler: " + instructor.getFirstName() + " " + instructor.getLastName());
		}
		System.out.println("");
		
		System.out.println("/********************************/");
		
		System.out.println(category1);
		System.out.println(category2);
		System.out.println(category3);
		
		System.out.println("/********************************/");
		
		System.out.println(instructor1);
		System.out.println(instructor2);
		System.out.println(instructor3);
		
	}

}
