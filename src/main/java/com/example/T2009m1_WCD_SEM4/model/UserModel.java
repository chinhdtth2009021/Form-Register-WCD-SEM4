package com.example.T2009m1_WCD_SEM4.model;


import java.util.List;

public interface UserModel {
    boolean save(User user);
    boolean update(int id, User updateUser);
    boolean delete(int id);
    List<User> findAll();
    User findById(int id);
}
