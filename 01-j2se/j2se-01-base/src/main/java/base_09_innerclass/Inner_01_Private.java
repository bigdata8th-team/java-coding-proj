package base_09_innerclass;

public class Inner_01_Private {
	public String name;
	public int age;
	private Inner inner;
	
	public void testOuter(){
		System.out.println("outer");
		Inner in = new Inner();
		in.testInner();
	}

	public void setInner() {
		this.inner = new Inner();
	}

	public Inner getInner() {
		return inner;
	}
	
	class Inner{
		int a = 0;

		public void setA(int a) {
			this.a = a;
		}

		public int getA() {
			return a;
		}

		public void testInner(){
			System.out.println("inner");
		}
	}
	
	public static void main(String[] args) {
		Inner_01_Private outer = new Inner_01_Private();
		outer.testOuter();
		outer.setInner();
		outer.getInner().setA(100);
		System.out.println(outer.getInner().getA());
	}
}
