package spring_01_bean;

import java.io.Serializable;
public class Student implements Serializable {
    private Computer computer;
    private MobilePhone mobilePhone;
    public Computer getComputer() {
        return computer;
    }
    public void setComputer(Computer computer) {
        this.computer = computer;
    }
    public MobilePhone getMobilePhone() {
        return mobilePhone;
    }
    public void setMobilePhone(MobilePhone mobilePhone) {
        this.mobilePhone = mobilePhone;
    }
}