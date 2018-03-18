package base_08_interface;

/*
 * interface规范：
 * 1.接口不能有非抽象方法，抽象类可以有
 * 2.可以有default方法（1.8新增）
 * 3.继承是单继承，接口可以多实现
 */
public interface Action {
	public static final String WARRING = "版权所有，盗版必究";
	public void eat();  //可以省略关键字abstract
	public void speak();
	public void run();
	
	// jdk1.8 可以有静态的方法，使用（接口名.方法名）调用
	public static void discribe() {
		System.out.println("描述生物的活动的接口");
	}
	
	/*
	 * default方法，其实就是普通方法，子类可以重写，也可以直接调用，
	 * 子类如果想重写，在子类中要去掉default关键字
	 */
	public default void die(int life) {
		System.out.println("万物皆有一死");
		System.out.println("生命周期为：" + life + " 年");
	}
}
