package spring_03_annotation;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.Serializable;

@Component("example")
public class ExampleBean implements Serializable {

    public ExampleBean() {
        System.out.println("实例化ExampleBean：" + this);
    }

    @PostConstruct
    public void init() {
        System.out.println("初始化ExampleBean");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("销毁ExampleBean");
    }

    public void execute() {
        System.out.println("执行execute方法");
    }

}