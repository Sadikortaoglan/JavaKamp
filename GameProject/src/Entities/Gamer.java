package Entities;
import Abstract.Entity;

public class Gamer implements Entity {
	
	private int id ;
	private String tc;
	private String firstName;
	private String lastName;
	
	public Gamer() {
		
	}
	public Gamer(int id, String tc, String firstName, String lastName) {
		super();
		this.id = id;
		this.tc = tc;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTc() {
		return tc;
	}
	public void setTc(String tc) {
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

}
