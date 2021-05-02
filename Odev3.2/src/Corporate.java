
public class Corporate extends User {
	int id;
	int UserId;
	String companyName;
	
	public Corporate() {
		
	}
	public Corporate(int id, int userId, String companyName) {
		super();
		this.id = id;
		UserId = userId;
		this.companyName = companyName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
}
