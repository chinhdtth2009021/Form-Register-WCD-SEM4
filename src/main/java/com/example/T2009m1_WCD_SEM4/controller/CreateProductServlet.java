package com.example.T2009m1_WCD_SEM4.controller;

import com.example.T2009m1_WCD_SEM4.entity.Product;
import com.example.T2009m1_WCD_SEM4.model.MysqlProduct;
import com.example.T2009m1_WCD_SEM4.model.ProductModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CreateProductServlet extends HttpServlet {
    private ProductModel productModel;
    @Override
    public void init() throws ServletException {
        productModel = new MysqlProduct();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/products/create.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String thumbnail = req.getParameter("thumbnail");
        Double price  = Double.parseDouble(req.getParameter("price"));
        String manufactureEmail = req.getParameter("manufactureEmail");
        String manufacturePhone = req.getParameter("manufacturePhone");
        String description = req.getParameter("description");
        String detail = req.getParameter("detail");
        Product product = new Product(name, description, detail, price, thumbnail, manufactureEmail, manufacturePhone);

    }
}
