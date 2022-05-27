package com.example.T2009m1_WCD_SEM4.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MySqlUserModelTest {
    MySqlUserModel mySqlUserModel = new MySqlUserModel();

    @Test
    void save() {
        User user = new User(1, "lam","lamson", "lamson@gmail.com", "123456", 1 );

        assertEquals(true, mySqlUserModel.save(user));
    }
}