package base_13_collection._01_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Collections可以完成对列表的排序
 */

public class List_03_Sort {
	private static class Person {
		private String name;
		private int age;
		private double height;
		
		public Person(String name, int age, double height) {
			this.name = name;
			this.age = age;
			this.height = height;
		}
		
		@Override
		public String toString() {
			return "[" + name + ":age=" + age + " height=" + height + "]";
		}
	}
	
	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		list.add(new Person("hank", 28, 170));
		list.add(new Person("bob", 30, 155));
		list.add(new Person("james", 17, 168));
		list.add(new Person("bob", 20, 155));
		
		// 1.list.sort
		System.out.println("====1.list.sort====");
		list.sort((o1, o2)->o1.age - o2.age);
		System.out.println(list);
		
		// 2.Collections.sort
		System.out.println("====2.Collections.sort====");
		Collections.sort(list, (o1, o2)->(int)o1.height - (int)o2.height);
		System.out.println(list);
		
	}
}
