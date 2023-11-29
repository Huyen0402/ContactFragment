package com.example.contact;

public class Contact {
    private int id;
    private String name;
    private String phoneNumber;
    private String email;

    public Contact(int id, String name, String phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return name;
    }
}