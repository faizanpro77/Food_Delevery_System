package com.bridgelabz;

public class Customer {
    //unique Id
    String phoneNumber;
    String address;
    String nameOfCustomer;
    String emailId;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNameOfCustomer() {
        return nameOfCustomer;
    }

    public void setNameOfCustomer(String nameOfCustomer) {
        this.nameOfCustomer = nameOfCustomer;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "mobileNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", name='" + nameOfCustomer + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }
}
