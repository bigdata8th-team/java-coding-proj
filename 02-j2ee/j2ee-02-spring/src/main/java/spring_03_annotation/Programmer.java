package spring_03_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Programmer implements Serializable {
    private Computer computer;
    @Autowired
    public Programmer(@Qualifier("computer") Computer computer) {
        this.computer = computer;
    }
    public Computer getComputer() {
        return computer;
    }
    public void setComputer(Computer computer) {
        this.computer = computer;
    }
}