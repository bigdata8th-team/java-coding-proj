package base_16_io;

import java.io.*;

/*
 * ObjectOutputStream���л�
 * �CwriteObject(Object o)��ʵ�ֶ������л��ķ���
 * Ϊ����ĳ�����ǿ����л��ģ��������ʵ��Serializable�ӿ�
 * transient�ؼ���:�����ĳЩ����������뱻���л���������transient���Ρ�
 * ͨ��ʵ�ָýӿڵ�����Ҫ�ṩһ������serialVersionUID�������б仯��ʱ�򣬿��Լ���
 * ͨ��ObjectInputStream���Խ��з����л�
 */

public class IO_09_Serializable {
	
	public static class Student implements Serializable{

		private static final long serialVersionUID = 1L;
		
		String name;
		int age;
		transient String other;//transient �ó�Ա�������������л�

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
			Student stu = new Student("����",23,"dfadfdsfad");
			oos.writeObject(stu);
			Student newStu = (Student) ois.readObject();//���ֶ���ֻ����new,�����Է����л�
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
