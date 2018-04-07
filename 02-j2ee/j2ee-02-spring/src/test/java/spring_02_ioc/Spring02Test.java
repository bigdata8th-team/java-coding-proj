package spring_02_ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class Spring02Test {
    /**
     * 测试IOC
     */
//    @Test
//    public void test0() {
//    	//将配置文件导入到上下文中
//        String cfg = "applicationContext.xml";
//        ApplicationContext ctx =
//            new ClassPathXmlApplicationContext(cfg);
//        //通过spring创建实例
//        MessageBean bean = ctx.getBean("msg", MessageBean.class);
//        bean.execute();
//    }
//
    /**
     * 注入参数值
     */
//    @Test
//    public void test1() {
//        String cfg = "applicationContext.xml";
//        ApplicationContext ctx =
//            new ClassPathXmlApplicationContext(cfg);
//        MessageBean bean = ctx.getBean("msg", MessageBean.class);
//        bean.execute();
//    }

//    /**
//     * 采用引用的方式注入集合
//     */
//    @Test
//    public void test2() {
//        String cfg = "applicationContext.xml";
//        ApplicationContext ctx =
//            new ClassPathXmlApplicationContext(cfg);
//        MessageBean bean = ctx.getBean("msg2", MessageBean.class);
//        bean.execute();
//    }
//
//    /**
//     * 注入表达式
//     */
    @Test
    public void test3() {
        String cfg = "applicationContext-spring-02.xml";
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext(cfg);
        DemoBean bean = ctx.getBean("demo", DemoBean.class);
        bean.execute();
    }
}