package spring_03_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Teacher implements Serializable {
    private Computer computer;
    @Autowired
    public void setComputer(
        @Qualifier("computer") Computer computer) {
        this.computer = computer;
        System.out.println("Teacher");
    }
    
    public Computer getComputer() {
        return computer;
    }
}