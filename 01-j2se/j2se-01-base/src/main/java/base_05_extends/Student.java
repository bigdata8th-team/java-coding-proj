package base_05_extends;

public class Student extends Human {
	
	private int score;
	private int id;

	public Student() {
		super(1,2,3,4);
		score = 0;
		id = 84;
	}
	
	public Student(int score, int id) {
		super(1,2,3,4);
		this.score = score;
		this.id = id;
	}
	
	public Student(int sex, int age, int weight, int height, int score, int id) {
		super(sex, age, weight, height);
		this.score = score;
		this.id = id;
	}
	
	public void displayStuInfo() {
		System.out.println("score = " + score);
		System.out.println("id = " + id);
	}
	
	protected void eat() {
		System.out.println("student eats apples display");
	}

	@Override
    public void eat(String food) {
		System.out.println("student eats " + food);
	}
}
