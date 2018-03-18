package base_06_abstract;
/*
 * 抽象类就是父类，把子类的公共部分提出来
 * 和普通父类的区别是：
 * 		提出来的公共部分不实现
 * 		抽象类只是比普通类多了一种抽象方法，其他的普通类有东西，它都可以有
 * 抽象类在class前加上关键字abstract
 * 抽象方法在返回值前加上关键字abstract
 * 如果一个类包含抽象方法，这个类叫抽象类
 * 抽象类不能new ,因为抽象类里可能会有抽象的方法（没被实现的方法）
 * 只要一个类被定义成抽象类，它就不能new 
 * 子类必须实现抽象父类的所有抽象方法，才算完整，才能new,除非这个子类也是抽象类
 * abstract和final不能同时修饰一个类
 */
public abstract class Abstract_01_Father {
	static String lastName;
	String name;
	public abstract void display();//抽象方法，和普通方法的区别是，没有大括号
	public void test() {
		System.out.println("test");
	}
	public Abstract_01_Father() {
		System.out.println("Abstract_01_Father constructor");
	}
}
