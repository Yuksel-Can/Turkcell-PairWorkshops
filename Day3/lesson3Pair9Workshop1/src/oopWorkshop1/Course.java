package oopWorkshop1;

public class Course {

	private int id;
	private String name;
	private String description;
	private String image;
	
	private Category[] category;
	private Instructor[] instructor;

	
	public Course() {
		super();
	}

	public Course(int id, String name, String description, String image) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.image = image;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Category[] getCategory() {
		return category;
	}

	public void setCategory(Category[] category) {
		this.category = category;
	}

	public Instructor[] getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor[] instructor) {
		this.instructor = instructor;
	}
	
	@Override
	public String toString() {
		System.out.print("Kurs id: " + this.id + ", Ýsim: " + this.name + ", Açýklama: " + this.description + ", Ýmage: " + this.image);
		this.getCourseInformation();
		return "";
	}
	
	public void getCourseInformation() {
		System.out.print(", Eðitmenler: ");
		for(Instructor instructor : this.getInstructor()) {
			System.out.print(instructor.getFirstName() + " " + instructor.getLastName() + ", ");
		}
		System.out.print(" Kategoriler: ");
		for(Category category : this.getCategory()) {
			System.out.print(category.getName() + ", ");
		}
	}
	
}
