package base_12_classlib;

public class Classlib_02_Clone {
	public static void main(String[] args) throws CloneNotSupportedException {
		Dog d1 = new Dog();
		Dog d2 = (Dog) d1.clone();
		System.out.println(d1 == d2);
		System.out.println("hello world;ÄãºÃ;hello dog;");
		
	}
}	
