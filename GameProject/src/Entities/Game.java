package Entities;
import Abstract.Entity;

public class Game implements Entity{

	private int id;
	private String name;
	private boolean price;
	public Game() {
		
	}
	public Game(int id, String name, boolean price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isPrice() {
		return price;
	}
	public void setPrice(boolean price) {
		this.price = price;
	}
}
