package base_13_collection._02_set;

import java.util.Set;
import java.util.TreeSet;

/*
 * TreeSet
 * ���򣬲��ظ���������null
 * װ��ĳ������ʵ��Comparable�ӿ�
 */

public class Set_03_TreeSet {
	private static class Personal implements Comparable<Personal> {
		String name;
		int age;
		int score;
		
		public Personal(String name, int age, int score) {
			this.name = name;
			this.age = age;
			this.score = score;
		}
		
		@Override
		public int compareTo(Personal o) {
			return this.age - o.age;
		}
		
		@Override
		public String toString() {
			return "[name=" + name + ",age=" + age + ",score=" + score + "]";
		}
	}
	
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>();
		
		set.add(4);
		set.add(3);
		set.add(5);
		
		System.out.println(set);
		
		Set<Personal> personalSet = new TreeSet<>();
		
		personalSet.add(new Personal("hank", 28, 90));
		personalSet.add(new Personal("james", 32, 97));
		personalSet.add(new Personal("vencent", 19, 82));
		
		System.out.println(personalSet);
	}
}
