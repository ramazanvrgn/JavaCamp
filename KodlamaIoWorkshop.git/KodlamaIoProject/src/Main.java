
public class Main {

	public static void main(String[] args) {
		Student student= new Student();
		student.setId(1);
		student.setFirstName("Aslan");
		student.setLastName("Ballý");
		student.setAge(27);
		student.setCourse("Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)");
		
		Instructor instructor= new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demirog");
		instructor.setBiography("MCT, PMP ve ITIL sertifikalarýna sahip.");
		
		Course course=new Course();
		course.setId(1);
		course.setName("Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)");
		course.setDescription("Geleceðin yazýlým geliþtiricisi olmak ister misiniz?");
		course.setStatus(true);
		
		UserManager userManager=new UserManager();
		userManager.add(instructor);
		userManager.add(student);

	}

}
