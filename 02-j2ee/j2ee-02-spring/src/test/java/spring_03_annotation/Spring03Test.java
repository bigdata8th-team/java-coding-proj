package spring_03_annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class Spring03Test {
//    /**
//     * 使用注解声明bean
//     */
//    @Test
//    public void test1() {
//        String cfg = "applicationContext.xml";
//        ApplicationContext ctx =
//            new ClassPathXmlApplicationContext(cfg);
//        ExampleBean bean =
//            ctx.getBean("example", ExampleBean.class);
//        System.out.println(bean);
//    }
//
//    /**
//     * 使用注解声明bean的作用域
//     */
//    @Test
//    public void test2() {
//        String cfg = "applicationContext.xml";
//        ApplicationContext ctx =
//            new ClassPathXmlApplicationContext(cfg);
//        ExampleBean bean1 =
//            ctx.getBean("example", ExampleBean.class);
//        ExampleBean bean2 =
//            ctx.getBean("example", ExampleBean.class);
//        System.out.println(bean1==bean2);
//    }
//
//    /**
//     * 使用注解声明bean的生命周期
//     */
//    @Test
//    public void test3() {
//        String cfg = "applicationContext.xml";
//        AbstractApplicationContext ctx =
//            new ClassPathXmlApplicationContext(cfg);
//        ExampleBean bean =
//            ctx.getBean("example", ExampleBean.class);
//        bean.execute();
//        ctx.close();
//    }
//
//    /**
//     * 在setter上使用@Resource，以setter方式注入bean
//     * <property name="computer" ref="computer"/>
//     */
//    @Test
//    public void test4() {
//        String cfg = "applicationContext.xml";
//        ApplicationContext ctx =
//            new ClassPathXmlApplicationContext(cfg);
//        Manager manager =
//            ctx.getBean("manager", Manager.class);
//        System.out.println(manager);
//        System.out.println(manager.getComputer());
//        Computer computer = ctx.getBean("computer", Computer.class);
//        System.out.println(computer);
//    }
//
//    /**
//     * 在属性上使用@Resource，以setter方式注入bean
//     * <property name="computer" ref="computer"/>
//     */
//    @Test
//    public void test5() {
//        String cfg = "applicationContext.xml";
//        ApplicationContext ctx =
//            new ClassPathXmlApplicationContext(cfg);
//        Salesman man =
//            ctx.getBean("salesman", Salesman.class);
//        System.out.println(man);
//        System.out.println(man.getComputer());
//        Computer computer = ctx.getBean("computer", Computer.class);
//        System.out.println(computer);
//    }

    /**
     * 使用注解注入表达式
     */
    @Test
    public void test6() {
        String cfg = "applicationContext-spring-03.xml";
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext(cfg);

        Student stu = ctx.getBean("student", Student.class);
        System.out.println(stu.getComputer());
    }
}