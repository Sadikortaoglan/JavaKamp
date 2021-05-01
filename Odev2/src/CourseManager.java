
public class CourseManager {
	
	public void add(Course course)
	{
		System.out.println("Baþarýlý Bir Þekilde Kayýt Yapýldý.");
		System.out.println("------------Bilgileriniz--------");
		System.out.println("Id"+course.id);
		System.out.println("name"+course.nameString);
		System.out.println("instructorId"+course.instructorId);
	}
	public void getAll(Course[] courses)
	{
		for (Course course:courses) {
			System.out.println(course);
		}
	}
	

}
