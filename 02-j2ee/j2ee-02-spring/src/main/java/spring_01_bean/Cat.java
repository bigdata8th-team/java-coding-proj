package spring_01_bean;

public class Cat {
    public Cat() {
        System.out.println("实例化Cat：" + this);
    }

    public void init() {
        System.out.println("初始化Cat");
    }

    public void destroy() {
        System.out.println("销毁Cat");
    }

    public void eat() {
        System.out.println("执行eat方法");
    }
}
