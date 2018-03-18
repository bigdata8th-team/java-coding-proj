package base_04_static;

public class StaticDemo {
	public static int id;
	
	public StaticDemo() {
		System.out.println("StaticDemo constructor");
	}
	
	public static void display() {
		System.out.println("static display");
	}
	
	/*
	 * ִֻ��һ��
	 */
	static {
		System.out.println("��̬����飬�ڼ���ʱִ��");
	}
	
	public static void main(String[] args) {
		
		
		StaticDemo demo = new StaticDemo();
		StaticDemo demo1 = new StaticDemo();
	
		System.out.println(demo.getClass());
		System.out.println(demo1.getClass());
		System.out.println(StaticDemo.id);
		StaticDemo.display();
	}
}
