package base_11_generic;

import java.util.ArrayList;
import java.util.List;

public class Demo12 {
	public static void main(String[] args) {
		List<String> l1 = new ArrayList<>();
		l1.add("aaa");
		l1.add("bbb");
		l1.add("ccc");
		l1.add("ddd");
		test(l1);
		List<Integer> l2 = new ArrayList<>();
		l2.add(2);
		l2.add(3);
		l2.add(4);
		l2.add(5);
		test(l2);
		test1(l1,l2);
		
	}
	//?ͨ���
	//? extendsͨ�������
	//? superͨ�������
	//<T>����ǰ���巺�ͣ�һ��Ϊ�˲�������һ��
	public static void test(List<?> list){//ͨ���
		System.out.println(list);
	}
	public static void test1(List<?> list,List<?> list2){//ͨ���
		System.out.println(list);
	}
}
