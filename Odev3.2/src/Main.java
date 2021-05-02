
public class Main {

	public static void main(String[] args) {
		//User Register
		User resul=new User(1,"resul@gmail.com","123");
		
		UserManager userManager=new UserManager();

		userManager.register(resul);
		
		//Instructor Update
		
		Instructor sadık=new Instructor(1, 1, "Sadık", "Ortaoğlan");
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.update(sadık);
		
		//Student
		
		Student student=new Student(1,2,"Ali","Kaya");
		StudentManager studentManager=new StudentManager();
		studentManager.add(student);
		
		
		//Corporate Delete
		
		Corporate corporate=new Corporate(1,2,"Ölmez Bilişim");
		
		CorporateManager corporateManager=new CorporateManager();
		corporateManager.delete(corporate);
		

	}

}
