package com.example.T2009m1_WCD_SEM4.controller;

import com.example.T2009m1_WCD_SEM4.entity.Account;
import com.example.T2009m1_WCD_SEM4.entity.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Registerservlet extends HttpServlet {

@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String currentName = req.getParameter("currentName");
    req.setAttribute("currentName",currentName);
    req.getRequestDispatcher("/user/register.jsp").forward(req, resp);
}

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String username = req.getParameter("username");
        String fullName = req.getParameter("fullName");
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");
        String birthday = req.getParameter("birthday");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");
            Account account = new Account();
        account.setUsername(username);
        account.setFullName(fullName);
        account.setPassword(password);
        account.setEmail(email);
        account.setPhone(phone);
        account.setBirthday(birthday);
        req.setAttribute("account", account);
        req.getRequestDispatcher("/user/register-succes.jsp").forward(req, resp);
    }
}
