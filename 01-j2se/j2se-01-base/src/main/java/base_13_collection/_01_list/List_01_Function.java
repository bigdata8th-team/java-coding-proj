package base_13_collection._01_list;

import java.util.ArrayList;
import java.util.List;

/*
 * List接口继承自Collection接口，并实现了：
 * 1.sort    排序
 * 2.get    
 * 3.set     将对应的位置的值替换，add是插入
 * 4.indexOf 取元素索引
 * 5.subList 取子列表
 */

public class List_01_Function {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
				
		list.add("java");
		list.add("c++");
		list.add("c");
		list.add("shell");
		list.add("python");
		list.add("xml");
		list.add("perl");
		
		System.out.println(list);
		
		// 1.sort
		System.out.println("====1.sort====");
		list.sort((o1, o2) -> o1.charAt(o1.length() - 1) - 
				o2.charAt(o2.length() - 1));
		System.out.println(list);
		
		list.sort((o1, o2) -> o1.compareTo(o2));
		System.out.println(list);
		
		// 2.get
		System.out.println("====2.get====");
		System.out.println(list.get(0));
		System.out.println(list.get(list.size() - 1));
		
		// 3.set
		System.out.println("====3.set====");
		System.out.println(list.set(0, ".net"));
		list.add(0, "c#");
		System.out.println(list);
		
		// 4.indexOf
		System.out.println("====4.indexOf====");
		System.out.println(list.indexOf("c++"));
		
		// 5.subList
		System.out.println("====5.subList====");
		System.out.println(list.subList(2, 5));
	}
}
