package oopWorkshop1;

public class Category {
	
	private int id;
	private String name;
	
	private Course[] course;

	public Category() {
		super();
	}

	public Category(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	public Course[] getCourse() {
		return course;
	}

	public void setCourse(Course[] course) {
		this.course = course;
	}
	
	@Override
	public String toString() {

		return "Kategory Ýd: " + this.id + " ,Kategori Adý: " + this.name;
	}
	
}
