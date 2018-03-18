package base_05_extends;

public class Human {
	private int sex;
	private int age;
	private int weight;
	private int height;
	
	public Human() {
		this.sex = 0;
		this.age = 0;
		this.weight = 0;
		this.height = 0;
		System.out.println("Human constructor");
	}
	
	public Human(int sex, int age, int weight, int height) {
		this.sex = sex;
		this.age = age;
		this.weight = weight;
		this.height = height;
		System.out.println("Human constructor with para");
	}
	
	protected void display() {
		System.out.println("sex = " + sex);
		System.out.println("age = " + age);
		System.out.println("weight = " + weight);
		System.out.println("height = " + height);
	}
	
	public void setStatus(int sex, int age, int weight, int height) {
		this.sex = sex;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	
	public void eat(String food) {
		System.out.println("i eat " + food + " today!");
	}
	
	public void see(String[] things) {
		for (int i = 0; i < things.length; i++) {
			System.out.println("i see " + things[i] + " today!");
		}
	}
}
