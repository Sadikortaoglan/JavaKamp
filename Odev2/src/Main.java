
public class Main {

	public static void main(String[] args) {
		Instructor �nsInstructor=new Instructor(1, "Engin", "Demiro�");
		Course course=new Course(1, "C#-Angulae", 1);
		
		Course[] courses= {course};
		CourseManager courseManager=new CourseManager();
		courseManager.getAll(courses);

	}

}
