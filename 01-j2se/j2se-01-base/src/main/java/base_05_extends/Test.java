package base_05_extends;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		Student stu = new Student();

//		stu.display();
//		stu.displayStuInfo();
//		stu.eat();
//		stu.eat("»‚º–‚…");
//		
//		MiddleSchoolStudent midStu = new MiddleSchoolStudent();
//		midStu.display();
//		midStu.eat();
//		
//		int num = Teacher.add(4, 5);    // static∑Ω∑®
//		System.out.println(num);
//		System.out.println(stu.toString());
		
		ArrayList<Student> stuList = new ArrayList<Student>();
		stuList.add(stu);
		stuList.add(new Student(84, 90));
		stuList.add(new Student(1, 10, 160, 170, 90, 86));
		
		System.out.println(stuList.size());
		
		stuList.set(1, new Student(1, 100, 175, 170, 93, 99));
		stuList.get(1).display();
		stuList.get(2).display();
		System.out.println(stuList.indexOf(stu));	
	}
}
