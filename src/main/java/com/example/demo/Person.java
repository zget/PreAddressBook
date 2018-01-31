package com.example.demo;

public class Person {

    private String first_name;
    private String last_name;
    private String address;
    private long phone_number;
    private String email;

    public Person(String first_name, String last_name, String address, int phone_number, String email) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.phone_number = phone_number;
        this.email = email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getAddress() {
        return address;
    }

    public long getPhone_number() {
        return phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
