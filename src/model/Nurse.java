package model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Nurse extends User {

    private String speciality;

    //Constructor main
    public Nurse(String name, String email, String address, int phoneNumber, String speciality) {
        super(name, email, address, phoneNumber);
        this.speciality = speciality;
    }

    //GETTER AND SETTERS

    public String getSpeciality() { return speciality; }

    public void setSpeciality(String speciality) { this.speciality = speciality; }


    /**
     * Abstract method that employ the class Doctor and Nurse
     * show all data of user
     */
    @Override
    public void showData() {

    }
}
