package base_09_innerclass;

public class Inner_01_Private {
	public String name;
	public int age;
	
	public void testOuter(){
		System.out.println("outer");
		Inner in = new Inner();
		in.testInner();
	}
	
	private class Inner{
		public void testInner(){
			System.out.println("inner");
		}
	}
	
	public static void main(String[] args) {
		Inner_01_Private outer = new Inner_01_Private();
		outer.testOuter();
	}
}
