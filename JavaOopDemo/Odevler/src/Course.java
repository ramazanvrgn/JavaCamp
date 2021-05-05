

public class Course {

	public Course() {

	}

	public Course(int id, String name, String imageUrl, String createDate, boolean active) {
		this.id = id;
		this.name = name;
		this.imageUrl = imageUrl;
		this.createDate = createDate;
		this.active = active;
	}

	int id;
	String name;
	String imageUrl;
	String createDate;
	boolean active;

}
