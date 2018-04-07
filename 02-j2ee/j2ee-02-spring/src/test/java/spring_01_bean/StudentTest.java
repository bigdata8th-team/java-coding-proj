package spring_01_bean;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

import static org.junit.Assert.*;

public class StudentTest {
    /**
     * 实例化Spring容器
     */
//    @Test
//    public void test1() {
//        String cfg = "applicationContext.xml";
//        ApplicationContext ctx =
//            new ClassPathXmlApplicationContext(cfg);
//        System.out.println(ctx);
//    }

//    @Test
//    public void test2() {
//    	//启动Spring容器
//        String cfg = "applicationContext.xml";
//        ApplicationContext ctx = new ClassPathXmlApplicationContext(cfg);
//        Dog dog = (Dog)ctx.getBean("dog");//两种方法获得bean
//        Dog dog1 = ctx.getBean("dog", Dog.class);
//        System.out.println(dog==dog1);
//        dog.eat();
//        dog1.eat();
//    }
    /**
     * 3种实例化bean的方式
     */
//    @Test
//    public void test2() {
//        String cfg = "applicationContext.xml";
//        ApplicationContext ctx =
//            new ClassPathXmlApplicationContext(cfg);
//
//        Calendar cal1 = (Calendar) ctx.getBean("obj1");
//        System.out.println(cal1);
//
//        Calendar cal2 = ctx.getBean("obj2", Calendar.class);
//        System.out.println(cal2);
//
//        Date date = ctx.getBean("obj4", Date.class);
//        System.out.println(date);
//    }


    /**
     * bean的作用域
     */
//    @Test
//    public void test3() {
//        String cfg = "applicationContext.xml";
//        ApplicationContext ctx =
//            new ClassPathXmlApplicationContext(cfg);
//        Calendar cal1 = (Calendar) ctx.getBean("obj5");
//        Calendar cal2 = (Calendar) ctx.getBean("obj5");
//        System.out.println(cal1==cal2);
//    }

    /**
     * 1.bean的生命周期；
     * 2.bean的延迟实例化；
     */
//    @Test
//    public void test4() {
//        String cfg = "applicationContext.xml";
//        AbstractApplicationContext ctx =
//            new ClassPathXmlApplicationContext(cfg);
//        System.out.println("----------------");
//        ExampleBean bean = ctx.getBean("exampleBean", ExampleBean.class);
//        bean.execute();
//        ctx.close();
//    }
//
//    /**
//     * setter注入
//     */
//    @Test
//    public void test5() throws SQLException {
//        String cfg = "applicationContext.xml";
//        AbstractApplicationContext ctx =
//            new ClassPathXmlApplicationContext(cfg);
//        Computer computer =
//            ctx.getBean("computer", Computer.class);
//        System.out.println(computer.getMainboard());
//        System.out.println(computer.getHdd());
//        System.out.println(computer.getRam());
//    }

    /**
     * 构造器注入
     */
    @Test
    public void test6() throws SQLException {
        String cfg = "applicationContext.xml";
        AbstractApplicationContext ctx =
                new ClassPathXmlApplicationContext(cfg);
        MobilePhone phone =
                ctx.getBean("phone", MobilePhone.class);
        System.out.println(phone.getCpu());
        System.out.println(phone.getRam());
    }

    /**
     * 自动装配
     */
    @Test
    public void test7() throws SQLException {
        String cfg = "applicationContext.xml";
        AbstractApplicationContext ctx =
                new ClassPathXmlApplicationContext(cfg);
        Student student =
                ctx.getBean("student", Student.class);
        System.out.println(student.getComputer().getMainboard());
        System.out.println(student.getMobilePhone());
    }

//    /**
//     * 生命周期
//     */
//    @Test
//    public void test8() throws SQLException {
//
//        String cfg = "applicationContext.xml";
//        AbstractApplicationContext ctx =
//            new ClassPathXmlApplicationContext(cfg);
//        System.out.println("--------------------");
//        Cat c = ctx.getBean("cat",Cat.class);
//        c.eat();
//        ctx.close();
//    }
//
//
//    /**
//     * clone
//     */
//    @Test
//    public void test9() throws SQLException {
//
//        String cfg = "applicationContext.xml";
//        AbstractApplicationContext ctx =
//            new ClassPathXmlApplicationContext(cfg);
//        System.out.println("--------------------");
//        Student s1 = ctx.getBean("student",Student.class);
//        Student s2 = ctx.getBean("student",Student.class);
//        System.out.println("test....." + (s1==s2));
//        System.out.println("test1..." + (s1.getComputer()==s2.getComputer()));
//        ctx.close();
//    }
//
//    public static void test22(){
//    	System.out.println("ddd");
//    }
}