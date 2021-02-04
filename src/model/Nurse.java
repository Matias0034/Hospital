package model;

import java.util.Date;

public class Nurse extends User {

    private String speciality;

    public Nurse(String name, String email, String address, int phoneNumber, String speciality) {
        super(name, email, address, phoneNumber);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
