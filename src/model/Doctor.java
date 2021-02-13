package model;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {

    private String speciality;

    public Doctor(String name, String email, String address, String speciality, int phoneNumber){
        super(name,email,address,phoneNumber);
        this.speciality = speciality;
    }


    public String getSpeciality() {
        return speciality;
    }
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    /**
     * Abstract method that employ the class Doctor and Nurse
     * show all data of user
     */
    @Override
    public void showData() {

    }


    public class AvailableAppointment{

        //Attributes

       private int id;
       private Date date;
       private String time;


       //GETTER AND SETTERS

       public int getId() {
           return id;
       }

       public void setId(int id) {
           this.id = id;
       }

       public Date getDate() {
           return date;
       }

       public void setDate(Date date) {
           this.date = date;
       }

       public String getTime() {
           return time;
       }

       public void setTime(String time) {
           this.time = time;
       }


       //CONSTRUCTOR
       public AvailableAppointment(Date date, String time){
            this.date = date;
            this.time = time;
       }
   }

   ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
   public void addAvailableAppointment(Date date, String time){
       availableAppointments.add(new AvailableAppointment(date, time));
   }

   public ArrayList<AvailableAppointment> getAvailableAppointments(){
       return availableAppointments;
   }
}
