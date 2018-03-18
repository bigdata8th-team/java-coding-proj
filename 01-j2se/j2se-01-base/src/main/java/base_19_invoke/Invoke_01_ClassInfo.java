package base_19_invoke;

import java.lang.reflect.Constructor;

/*
 * 获得类信息：
 * 1.对象.getClass
 * 2.类.class
 * 3.Class.forName(类路径);
 */

public class Invoke_01_ClassInfo {
	
	private class Student {
		int age;
		int height;
		String name;
		
		@SuppressWarnings("unused")
		private Student() {
			// TODO Auto-generated constructor stub
		}
		
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
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException {
		Student stu = new Invoke_01_ClassInfo().new Student("hank", 28, 170);
		
		Class<? extends Student> c1 = stu.getClass();
//		Class<Student> c2 = Student.class;
//		Class.forName("com.bsr.classdemo.ClassDemo01");
		
		System.out.println(c1.getName());
		System.out.println(c1.getConstructors());
	
		System.out.println("获得多个构造方法");
		// raw type表示传参时需要传递带泛型的参数
		// @SuppressWarnings("rawtypes")可以去掉警告
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
		
		Constructor con = c1.getConstructor(Invoke_01_ClassInfo.class, String.class, Integer.TYPE, Integer.TYPE);
		System.out.println(con);
	}
}
