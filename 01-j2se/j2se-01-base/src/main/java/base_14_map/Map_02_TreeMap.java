package base_14_map;

import java.util.Map;
import java.util.TreeMap;

/*
 * TreeMap
 * key值必须是实现Comparable的。
 */

public class Map_02_TreeMap {
	private static class Student implements Comparable<Student> {
		private String name;
		private int score;
		
		public Student(String name, int score) {
			this.name = name;
			this.score = score;
		}

		@Override
		public int compareTo(Student o) {
			return this.score - o.score;
		}
		
		@Override
		public String toString() {
			return "[name=" + name + ":score=" + score + "]";
		}
		
	}
	
	public static void main(String[] args) {
		Map<String, Integer> map = new TreeMap<>();
		map.put("hank", 90);
		map.put("bob", 67);
		map.put("james", 86);
		map.put("slina", 97);	
		System.out.println(map);
		
		Map<Student, Integer> studentMap = new TreeMap<>();
		studentMap.put(new Student("hank", 90), 84);
		studentMap.put(new Student("james", 84), 82);
		studentMap.put(new Student("bob", 95), 69);
		System.out.println(studentMap);
	}
}
