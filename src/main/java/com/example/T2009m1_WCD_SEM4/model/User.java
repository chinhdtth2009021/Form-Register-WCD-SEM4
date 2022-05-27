package com.example.T2009m1_WCD_SEM4.model;

public class User {
    private int id;
    private String fullName;
    private String username;
    private String Email;
    private String passwordHash;
    private int status;

    public User() {

    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", username='" + username + '\'' +
                ", Email='" + Email + '\'' +
                ", passwordHash='" + passwordHash + '\'' +
                ", status=" + status +
                '}';
    }
    public User(int id, String fullName, String username, String email, String passwordHash, int status) {
        this.id = id;
        this.fullName = fullName;
        this.username = username;
        this.Email = email;
        this.passwordHash = passwordHash;
        this.status = status;
    }
    public User(String fullName, String username, String email, String passwordHash, int status) {
        this.fullName = fullName;
        this.username = username;
        this.Email = email;
        this.passwordHash = passwordHash;
        this.status = status;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
