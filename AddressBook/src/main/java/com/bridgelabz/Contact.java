package com.bridgelabz;

public class Contact {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private long pinCode;
    private String email;
    private long mobNumber;

    /**
     * Creates an Contact with the specified name.
     *
     * @param firstName The user first name.
     * @param lastName  The user last name.
     * @param address   The user address.
     * @param city      The user city.
     * @param state     The user city.
     * @param pinCode   The user zipcode.
     * @param email     The user email.
     * @param mobNumber The user mobile name.
     */
    public Contact(String firstName, String lastName, String address, String city, String state, long pinCode, String email, long mobNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
        this.email = email;
        this.mobNumber = mobNumber;
    }

    /**
     * Gets the user First name.
     *
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * This is a setter which sets the first name
     *
     * @param firstName - the firstName to be set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the user Last name.
     *
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * This is a setter which sets the last name
     *
     * @param lastName - the last name to be set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the user Address.
     *
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * This is a setter which sets the Address
     *
     * @param address - the address to be set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets the user City.
     *
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * This is a setter which sets the city
     *
     * @param city - the city to be set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Gets the user State.
     *
     * @return state
     */
    public String getState() {
        return state;
    }

    /**
     * This is a setter which sets the state
     *
     * @param state - the state to be set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Gets the user pin code.
     *
     * @return pinCode
     */
    public long getPinCode() {
        return pinCode;
    }

    /**
     * This is a setter which sets the pinCode
     *
     * @param pinCode - the pinCode to be set
     */
    public void setPinCode(long pinCode) {
        this.pinCode = pinCode;
    }

    /**
     * Gets the user Email id.
     *
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * This is a setter which sets the email
     *
     * @param email - the email to be set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the user mobile number.
     *
     * @return mobNumber
     */
    public long getMobNumber() {
        return mobNumber;
    }

    /**
     * This is a setter which sets the mobNumber
     *
     * @param mobNumber - the mobNumber to be set
     */
    public void setMobNumber(long mobNumber) {
        this.mobNumber = mobNumber;
    }

    @Override
    public String toString() {
        return "Contact [ FirstName=" + firstName + ",LastName=" + lastName + ",Address=" + address + ",City=" + city + ",State=" + state +
                ",PhoneNumber=" + mobNumber + ",Emailed=" + email + ",Zipcode=" + pinCode + "] ";
    }
}
