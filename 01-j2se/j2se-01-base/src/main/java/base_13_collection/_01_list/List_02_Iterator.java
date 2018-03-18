package base_13_collection._01_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * List遍历方式：
 * 1.forEach
 * 2.for循环
 * 3.iterator
 */

public class List_02_Iterator {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("java");
		list.add("c++");
		list.add("c");
		list.add("shell");
		list.add("python");
		list.add("xml");
		list.add("perl");
		
		// 1.forEach
		System.out.println("====1.forEach====");
		list.forEach(s -> System.out.print(s + "  "));
		System.out.println("");
		
		// 2.for循环
		System.out.println("====2.for====");
		for (String str : list) {
			System.out.print(str + "  ");
		}
		System.out.println("");
		
		// 3.iterator
		System.out.println("====3.iterator====");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + "  ");
		}
	}
}
