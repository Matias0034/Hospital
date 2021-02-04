package model;

public class User {

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
     * Constructor for entity Doctor
     * @param name
     * @param email
     * @param address
     * @param phoneNumber
     */
    public User(String name, String email,String address, int phoneNumber) {
        this.name = name;
        this.email = email;
        this.address = address;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "model.User{" + '\n' +
                "  name='" + name + '\n' +
                "  email='" + email + '\n' +
                "  address='" + address + '\n' +
                "  phoneNumber=" + phoneNumber + '\n' +
                '}';
    }
}
