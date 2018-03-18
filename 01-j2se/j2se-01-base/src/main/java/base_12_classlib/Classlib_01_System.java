package base_12_classlib;

public class Classlib_01_System {
	public static void main(String[] args) {
		System.out.println("hello");
		//当前时间到1970年的毫秒数，可用于计算时间差
		System.out.println(System.currentTimeMillis());;
		long d = System.currentTimeMillis();
		String str = "";
		for (int i = 0; i < 10000; i++) {
			str = str + i;
		}
		System.out.println(System.currentTimeMillis()-d);
		test();
		System.out.println("ddddd");
	}
	public static void test(){
		//return;
		System.exit(0);//退出进程ＡＰＩ
	}
}
