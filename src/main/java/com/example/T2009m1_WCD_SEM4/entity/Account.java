package com.example.T2009m1_WCD_SEM4.entity;

import java.util.HashMap;

public class Account {
    private String fullName;
    private String username;
    private String passwordHask;
    private String email;
    private int status;

    public Account() {
    }

    public Account(String fullName, String username, String passwordHask, String email, int status) {
        this.fullName = fullName;
        this.username = username;
        this.passwordHask = passwordHask;
        this.email = email;
        this.status = status;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswordHask() {
        return passwordHask;
    }

    public void setPasswordHask(String passwordHask) {
        this.passwordHask = passwordHask;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
