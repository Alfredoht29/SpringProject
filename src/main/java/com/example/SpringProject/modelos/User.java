package com.example.SpringProject.modelos;

import org.springframework.data.annotation.Id;
public class User {
    @Id
    private int Id;
    private String Usernames;
    private String Phonenumber;
    private String Email;

    public User(){

    }
    public User(int id, String usernames, String phonenumber, String email) {
        Id = id;
        Usernames = usernames;
        Phonenumber = phonenumber;
        Email = email;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getUsernames() {
        return Usernames;
    }

    public void setUsernames(String usernames) {
        Usernames = usernames;
    }

    public String getPhonenumber() {
        return Phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        Phonenumber = phonenumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
