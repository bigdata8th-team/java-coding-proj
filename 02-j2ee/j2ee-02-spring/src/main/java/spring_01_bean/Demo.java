package spring_01_bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Lazy//懒加载
//id="demo1"，可以不写，那会默认为对象的开头字母小写，eg. Computer-->computer
@Component("demo1")
//默认是单例模式
@Scope("prototype")
public class Demo {
    //init-method属性
    @PostConstruct
    public void init(){
        System.out.println("初始化回调方法");
    }
    //destroy-method属性
    @PreDestroy
    public void destroy(){
        System.out.println("销毁回调方法");
    }
    //<property name="computer" ref="computer"/>
    @Resource//需要注意的是Computer类也一定要有注解，否则Spring找不到
    private Computer computer;
    //<util:properties id="jdbc" location="classpath:jdbc.properties"/>
    @Value("#{jdbc.url}")
    private String url;
}
