package base_05_extends;

public class MiddleSchoolStudent extends Student {
	public MiddleSchoolStudent() {
		
	}
	
	protected void display() {
		System.out.println("middle student display");
	}
	
	public void eat(String food) {
		System.out.println("middle student eat " + food);
	}
}
