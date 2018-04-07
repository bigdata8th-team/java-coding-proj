package spring_03_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Student implements Serializable {
   
//    @Qualifier("computer")
    @Autowired
    private Computer computer;
    
    public Computer getComputer() {
        return computer;
    }
    
//    public void setComputer(Computer computer) {
//        this.computer = computer;
//        System.out.println("Student");
//    }
}