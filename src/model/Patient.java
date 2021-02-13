package model;

import java.util.Date;

public class Patient extends User {

    private String blood;
    private Date birthday;
    private double weight;
    private double height;


    public Patient(String name, String email, String blood, Date birthday, double weight, double height){
        super(name, email);
        this.blood = blood;
        this.birthday = birthday;
        this.weight = weight;
        this.height = height;

    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * show all data of user
     */
    @Override
    public void showData() {

    }
}
