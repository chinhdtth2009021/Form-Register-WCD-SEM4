package com.example.T2009m1_WCD_SEM4.entity;

public class Student {
    private  String rollNumber;
    private  String fullNme;
    private  int status;

    public Student() {
    }

    public Student(String rollNumber, String fullNme, int status) {
        this.rollNumber = rollNumber;
        this.fullNme = fullNme;
        this.status = status;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getFullNme() {
        return fullNme;
    }

    public void setFullNme(String fullNme) {
        this.fullNme = fullNme;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
