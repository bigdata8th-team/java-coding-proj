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
	//?通配符
	//? extends通配符上限
	//? super通配符下限
	//<T>方法前定义泛型，一般为了参数类型一致
	public static void test(List<?> list){//通配符
		System.out.println(list);
	}
	public static void test1(List<?> list,List<?> list2){//通配符
		System.out.println(list);
	}
}
