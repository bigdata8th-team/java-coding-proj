package base_12_classlib;

public class Classlib_01_System {
	public static void main(String[] args) {
		System.out.println("hello");
		//��ǰʱ�䵽1970��ĺ������������ڼ���ʱ���
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
		System.exit(0);//�˳����̣��У�
	}
}
