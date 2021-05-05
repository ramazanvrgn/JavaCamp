
public class Main {

	public static void main(String[] args) {
		
		Course course2= new Course(2,"Yazýlým Geliþtirici Kursu Java","https://foto","01.01.2021",true);
		
		Course course3= new Course(3,"Progralamaya Giriþ için Temel Kurs","https://foto","01.01.2021",true);
		
		Course course1=new Course();
		course1.id=1;
		course1.name="Yazýlým Geliþtirici Kursu C#";
		course1.imageUrl="https://foto";
		course1.createDate="01.01.2021";
		course1.active=true;
		
		Course[] courses={course1,course2,course3};
		for (Course course : courses) {
			System.out.println(course.name);
		}
		
		Teacher teacher =new Teacher();
		teacher.id=1;
		teacher.name=" ";
		teacher.biografhy="......................";
		
		CourseManager courseManager= new CourseManager();
		courseManager.Add();
		courseManager.Update();
		courseManager.Delete();

	}

}
