package base_09_innerclass;

public class Inner_02_Static {
	public static class InnerStaticClass {
		public void display() {
			System.out.println("static inner class");
		}
	}
	
	public static void main(String[] args) {
		InnerStaticClass is = new InnerStaticClass();
		is.display();
	}
}
