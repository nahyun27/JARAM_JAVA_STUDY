package c.inheritance;

public class Animal {
	String name;
	String kind;
	int legCount;
	public void setName(String name) {
		this.name = name;
	}
	
	public void move() {
		System.out.println(this.name+"움직움직");

	}
	public void eat() {
		System.out.println(this.name+ "냠냠");

	}
}
