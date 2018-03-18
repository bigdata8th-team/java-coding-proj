package base_09_innerclass;

public class Inner_04_Test {
	public static void main(String[] args) {
		Inner_01_Private in = new Inner_01_Private();
		in.testOuter();
		
		Inner_02_Static.InnerStaticClass isc = new Inner_02_Static.InnerStaticClass();
		isc.display();
		
		Inner_03_Public.InnerClass ic = new Inner_03_Public().new InnerClass();
		ic.displayVal();
	}
}
