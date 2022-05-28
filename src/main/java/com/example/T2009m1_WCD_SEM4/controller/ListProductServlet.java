package com.example.T2009m1_WCD_SEM4.controller;

import com.example.T2009m1_WCD_SEM4.entity.Product;
import com.example.T2009m1_WCD_SEM4.model.MysqlProduct;
import com.example.T2009m1_WCD_SEM4.model.ProductModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ListProductServlet extends HttpServlet {
    private ProductModel productModel;

    @Override
    public void init() throws ServletException {
        productModel = new MysqlProduct();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Product> productList = productModel.findAll();
        req.setAttribute("productList", productList);
        req.getRequestDispatcher("/products/list.jsp").forward(req, resp);
    }
}
