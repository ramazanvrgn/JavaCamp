
public class Main {

	public static void main(String[] args) {
		Student student= new Student();
		student.setId(1);
		student.setFirstName("Aslan");
		student.setLastName("Ball�");
		student.setAge(27);
		student.setCourse("Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)");
		
		Instructor instructor= new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demirog");
		instructor.setBiography("MCT, PMP ve ITIL sertifikalar�na sahip.");
		
		Course course=new Course();
		course.setId(1);
		course.setName("Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)");
		course.setDescription("Gelece�in yaz�l�m geli�tiricisi olmak ister misiniz?");
		course.setStatus(true);
		
		UserManager userManager=new UserManager();
		userManager.add(instructor);
		userManager.add(student);

	}

}
