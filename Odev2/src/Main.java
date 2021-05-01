
public class Main {

	public static void main(String[] args) {
		Instructor ınsInstructor=new Instructor(1, "Engin", "Demiroğ");
		Course course=new Course(1, "C#-Angulae", 1);
		
		Course[] courses= {course};
		CourseManager courseManager=new CourseManager();
		courseManager.getAll(courses);

	}

}
