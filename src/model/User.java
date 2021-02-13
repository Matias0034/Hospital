package model;

public abstract class User {

    private String name;
    private String email;
    private String address;
    private int phoneNumber;

    /**
     * Constructor for entity Patient
     * @param name
     * @param email
     */
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    /**
     * Constructor for class Doctor and Nurse
     * @param name
     * @param email
     * @param address
     * @param phoneNumber
     */
    public User(String name, String email,String address, int phoneNumber) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }


    /**
     * Abstract method that employ the class Doctor and Nurse
     * show all data of user
     */
    public abstract void showData();


    public void ad(){

    }
}
