package Entities;
import Abstract.Entity;

public class Gamer implements Entity {
	
	private int id ;
	private Long tc;
	private String firstName;
	private String lastName;
	private int dateOfBirthDate;
	
	public Gamer() {
		
	}
	public Gamer(int id, Long tc, String firstName, String lastName,int dateOfBirthDate) {
		super();
		this.id = id;
		this.tc = tc;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirthDate=dateOfBirthDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Long getTc() {
		return tc;
	}
	public void setTc(Long tc) {
		this.tc = tc;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getDateOfBirthDate() {
		return dateOfBirthDate;
	}
	public void setDateOfBirthDate(int dateOfBirthDate) {
		this.dateOfBirthDate = dateOfBirthDate;
	}

}
