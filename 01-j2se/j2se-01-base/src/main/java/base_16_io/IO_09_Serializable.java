package base_16_io;

import java.io.*;

/*
 * ObjectOutputStream序列化
 * –writeObject(Object o)：实现对象序列化的方法
 * 为了让某个类是可序列化的，该类必须实现Serializable接口
 * transient关键字:对象的某些属性如果不想被序列化，可以用transient修饰。
 * 通常实现该接口的类需要提供一个常量serialVersionUID，当类有变化的时候，可以兼容
 * 通过ObjectInputStream可以进行反序列化
 */

public class IO_09_Serializable {
	
	public static class Student implements Serializable{

		private static final long serialVersionUID = 1L;
		
		String name;
		int age;
		transient String other;//transient 该成员变量不参与序列化

		public Student(String name, int age, String other) {
			super();
			this.name = name;
			this.age = age;
			this.other = other;
		}

		@Override
		public String toString() {
			return "Student [name=" + name + ", age=" + age + ", other=" + other + "]";
		}
	}
	
	public static void main(String[] args) {
		try(
				FileOutputStream fos = new FileOutputStream("d:/stu1.txt");	
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				FileInputStream fis = new FileInputStream("d:/stu1.txt");	
				ObjectInputStream ois = new ObjectInputStream(fis);
				) {
			Student stu = new Student("张三",23,"dfadfdsfad");
			oos.writeObject(stu);
			Student newStu = (Student) ois.readObject();//发现对象不只可以new,还可以反序列化
			System.out.println(newStu);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
