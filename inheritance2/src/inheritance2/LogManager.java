package inheritance2;

public class LogManager {
	
	//spagetti kod
	public void log(int logType) {
		if(logType==1) {
			System.out.println("Veritaban�na Logland�");
		}else if(logType==2) {
			System.out.println("Dosyaya Logland�");
		}else {
			System.out.println("Email Logland�");
		}
	}
}
//1-- Database
//2-- File
//3-- Email