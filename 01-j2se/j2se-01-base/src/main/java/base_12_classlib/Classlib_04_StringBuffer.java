package base_12_classlib;

public class Classlib_04_StringBuffer {
	public static void main(String[] args) {
		String str = new String("hello");
		String s = "hello";//������
		System.out.println(s==str);
		s = "afsdfsdf";
		s = s+"	adfsadfsadfdf";
		s = s+"com.bsr.day01";
		StringBuffer buffer = new StringBuffer("����");//new ����
		buffer.append("hello");//append ���
		buffer.append(" world");//append ���
		System.out.println(buffer.toString());
		buffer.insert(0, " hihi ");//insert ����,offsetƫ����
		//buffer.delete(start, end);//deleteɾ��
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
		System.out.println("����ʱ�䣺"+(System.currentTimeMillis()-d));
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
		System.out.println("����ʱ�䣺"+(System.currentTimeMillis()-d));
	}
	public static void test2(){
		System.out.println(System.currentTimeMillis());;
		long d = System.currentTimeMillis();
		int sum = 0;
		for (int i = 0; i < 10000; i++) {
			sum = sum + i;
		}
		System.out.println("����ʱ�䣺"+(System.currentTimeMillis()-d));
	}
}
