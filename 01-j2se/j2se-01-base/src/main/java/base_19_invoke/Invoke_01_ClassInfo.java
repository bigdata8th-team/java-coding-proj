package base_19_invoke;

import java.lang.reflect.Constructor;

/*
 * �������Ϣ��
 * 1.����.getClass
 * 2.��.class
 * 3.Class.forName(��·��);
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
	
		System.out.println("��ö�����췽��");
		// raw type��ʾ����ʱ��Ҫ���ݴ����͵Ĳ���
		// @SuppressWarnings("rawtypes")����ȥ������
		Constructor cs[] = c1.getConstructors();
		for (Constructor c : cs) {
			System.out.println(c);
		}
		
		System.out.println("��ö�����췽��������private");
		cs = c1.getDeclaredConstructors();
		for (Constructor c : cs) {
			System.out.println(c);
		}
		
		System.out.println("���ĳ�����췽��");
		
		Constructor con = c1.getConstructor(Invoke_01_ClassInfo.class, String.class, Integer.TYPE, Integer.TYPE);
		System.out.println(con);
	}
}
