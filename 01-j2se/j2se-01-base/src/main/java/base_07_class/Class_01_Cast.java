package base_07_class;

public class Class_01_Cast {
	public static void main(String[] args) {
		System.out.println(Long.MIN_VALUE + "--" + Long.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE + "--" + Integer.MAX_VALUE);

		// 1.int ====》 Integer 1、构造器 2、Xxxx.valueOf()
		System.out.println("====1.int ----> Integer====");
		Integer ia = new Integer(111);
		Integer ib = Integer.valueOf(222);
		System.out.println(ia + " " + ib);

		// 2.Integer ====> int xxxValue();
		System.out.println("====2.Integer ----> int====");
		int ic = ia.intValue();
		ic = ia;
		System.out.println(ic);

		// 3.int ===》String
		System.out.println("====3.int ----> String====");
		String s1 = 123 + ""; // 推荐
		String s2 = String.valueOf(12321);
		System.out.println(s1 + " " + s2);

		// 4.Sting ===》int等效String ====》Integer ==>自动拆箱 int
		System.out.println("====4.String ----> int====");
		int val1 = Integer.valueOf("123");
		int val2 = Integer.parseInt("123");
		System.out.println(val1 + " " + val2);

		// 5.Integer ===》String // String值 必须是 数值
		s1 = ia + "";
		s1 = ia.toString(); // 推荐使用

		// 6.String ===》Integer
		ia = new Integer("111");
		ib = Integer.valueOf("111");
	}
}
