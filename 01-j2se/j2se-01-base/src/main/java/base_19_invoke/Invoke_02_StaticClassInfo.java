package base_19_invoke;

import java.lang.reflect.Constructor;

public class Invoke_02_StaticClassInfo {
	private static class Student {
		int age;
		int height;
		String name;
		
		private Student() {
			// TODO Auto-generated constructor stub
		}
		
		@SuppressWarnings("unused")
		public Student(String name, int age, int height) {
			this.name = name;
			this.age = age;
			this.height = height;
			
		}
		
		@Override
		public String toString() {
			return "[" + name + ":" + age + "/" + height + "]";
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		Student stu = new Student();
		
		Class<? extends Student> c1 = stu.getClass();
		
		System.out.println(c1.getName());
		System.out.println(c1.getConstructors());
	
		System.out.println("获得多个构造方法");
		Constructor cs[] = c1.getConstructors();
		for (Constructor c : cs) {
			System.out.println(c);
		}
		
		System.out.println("获得多个构造方法，包括private");
		cs = c1.getDeclaredConstructors();
		for (Constructor c : cs) {
			System.out.println(c);
		}
		
		System.out.println("获得某个构造方法");
		
		Constructor con = c1.getConstructor(String.class, Integer.TYPE, Integer.TYPE);
		System.out.println(con);
	}
}
