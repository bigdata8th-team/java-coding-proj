package spring_03_annotation;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.Serializable;

@Component
public class Manager implements Serializable {
    
    private Computer computer;
    @Resource
    public void setComputer(Computer computer) {
        this.computer = computer;
        System.out.println("Manager");
    }
    public Computer getComputer() {
        return computer;
    }
    
}