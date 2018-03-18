package base_19_invoke;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Invoke_03_InvokeCall {
	public static class Student {
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
		
		public void run() {
			System.out.println("run " + age + "" + height);
		}
		
		@SuppressWarnings("unused")
		private void eat() {
			System.out.println("eat");
		}
		
		@Override
		public String toString() {
			return "[" + name + ":" + age + "/" + height + "]";
		}
	}
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Student stu1 = new Student("bob", 30, 160);
		
		Class<Student> c1 = Student.class;
		Method[] method = c1.getMethods();
		Method method1[] = c1.getDeclaredMethods();
		
		System.out.println(Arrays.toString(method));
		System.out.println(Arrays.toString(method1));
		Method m1 = c1.getMethod("run");
		m1.invoke(stu1);
		
		method[0].invoke(stu1);
		method[1].invoke(stu1);
	}
}
