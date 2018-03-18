package base_12_classlib;

public class Classlib_04_StringBuffer {
	public static void main(String[] args) {
		String str = new String("hello");
		String s = "hello";//方法区
		System.out.println(s==str);
		s = "afsdfsdf";
		s = s+"	adfsadfsadfdf";
		s = s+"com.bsr.day01";
		StringBuffer buffer = new StringBuffer("李振：");//new 对象
		buffer.append("hello");//append 添加
		buffer.append(" world");//append 添加
		System.out.println(buffer.toString());
		buffer.insert(0, " hihi ");//insert 插入,offset偏移量
		//buffer.delete(start, end);//delete删除
		System.out.println(buffer.toString());
		test();
		test1();
		test2();
		
	}
	public static void test(){
		System.out.println(System.currentTimeMillis());;
		long d = System.currentTimeMillis();
		String str = "";
		for (int i = 0; i < 10000; i++) {
			str = str + i;
		}
		System.out.println("所需时间："+(System.currentTimeMillis()-d));
	}
	public static void test1(){
		System.out.println(System.currentTimeMillis());;
		long d = System.currentTimeMillis();
		/*String str = "";
		for (int i = 0; i < 10000; i++) {
			str = str + i;
		}*/
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < 10000; i++) {
			buffer.append(i);
		}
		System.out.println("所需时间："+(System.currentTimeMillis()-d));
	}
	public static void test2(){
		System.out.println(System.currentTimeMillis());;
		long d = System.currentTimeMillis();
		int sum = 0;
		for (int i = 0; i < 10000; i++) {
			sum = sum + i;
		}
		System.out.println("所需时间："+(System.currentTimeMillis()-d));
	}
}
