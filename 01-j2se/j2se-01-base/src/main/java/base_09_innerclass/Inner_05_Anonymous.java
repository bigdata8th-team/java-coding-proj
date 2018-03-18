package base_09_innerclass;

interface MyInter {
	public abstract void display();
}

/*
 * 匿名内部类
 * 1.普通类中的属性和对象是从属于对象的
 * 2.要创建对象就必须的有构造器
 * 3.构造器必须有类名
 * 4.匿名内部类是没有名字的内部类
 * 5.匿名内部类就相当于内部类要调用的外部类或接口的一个对象
 * 6.匿名类不用起名，按父类去new，把未实现的抽象方法实现
 */

public class Inner_05_Anonymous {
	public class Inner implements MyInter {
		public void display() {
			System.out.println("Inner display");
		}
	}

	public static void show(MyInter inter) {
		inter.display();
	}

	public static void main(String[] args) {
		Inner_05_Anonymous.Inner inner = new Inner_05_Anonymous().new Inner();
		show(inner);

		show(new MyInter() {

			@Override
			public void display() {
				System.out.println("Anonymous object");
			}
		});

		new MyInter() {

			@Override
			public void display() {
				System.out.println("Anonymous function test");
			}
		}.display();
	}
}
