package com.example.T2009m1_WCD_SEM4.controller;

import com.example.T2009m1_WCD_SEM4.model.MySqlUserModel;
import com.example.T2009m1_WCD_SEM4.model.User;
import com.example.T2009m1_WCD_SEM4.entity.Student;

import javax.jws.soap.SOAPBinding;
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
    String fullName = req.getParameter("fullName");
    System.out.println("Full name " + fullName);
    String username = req.getParameter("username");
    String Email = req.getParameter("Email");
    String passwordHash = req.getParameter("passwordHash");
    int status = Integer.parseInt(req.getParameter( "status" ));
    User user = new User(fullName, username, Email , passwordHash, status);
    MySqlUserModel mySqlUserModel = new MySqlUserModel();
    mySqlUserModel.save(user);
    resp.sendRedirect("/");
}
}
