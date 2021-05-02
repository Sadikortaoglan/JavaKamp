package Entities;

import java.time.LocalDate;

import Abstract.Entity;

public class Customer implements Entity {
	private int id;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private String naionalityId;
	
	public Customer() {
		
	}
	public Customer(int id, String firstName, String lastName, LocalDate dateOfBirth, String naionalityId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.naionalityId = naionalityId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getNaionalityId() {
		return naionalityId;
	}
	public void setNaionalityId(String naionalityId) {
		this.naionalityId = naionalityId;
	}

}
