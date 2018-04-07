package spring_01_bean;

import java.io.Serializable;
public class ExampleBean implements Serializable {

    public ExampleBean() {
        System.out.println("实例化ExampleBean：" + this);
    }

    public void init() {
        System.out.println("初始化ExampleBean");
    }

    public void destroy() {
        System.out.println("销毁ExampleBean");
    }

    public void execute() {
        System.out.println("执行execute方法");
    }

}