<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 5/28/2022
  Time: 11:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.HashMap" %>
<%@ page import="com.example.T2009m1_WCD_SEM4.entity.Product" %>
<%@ page import="com.example.T2009m1_WCD_SEM4.constant.SqlConstant" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html>

<head>
    <title>Product Create</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <style>
        .invalid-feedback {
            display: block;
        }
    </style>
</head>

<body>

<header>
    <nav class="navbar navbar-expand-md navbar-dark" style="background-color: tomato">
        <div>
            <a href="https://www.javaguides.net" class="navbar-brand"> Product Management App </a>
        </div>

        <ul class="navbar-nav">
            <li><a href="<%=request.getContextPath()%>/list" class="nav-link">Product List</a></li>
        </ul>
    </nav>
</header>
<br>
<div class="container col-md-5">
    <div class="card">
        <div class="card-body">
            <form action="/products/create" method="post">
                <fieldset class="form-group">
                    <label>Name</label> <input type="text"  class="form-control" name="name">
                </fieldset>

                <fieldset class="form-group">
                    <label>Thumbnail</label> <input type="text"  class="form-control" name="thumbnail" >
                </fieldset>

                <fieldset class="form-group">
                    <label>Price</label> <input type="number"  class="form-control" name="price">
                </fieldset>

                <fieldset class="form-group">
                    <label>Email</label> <input type="text"  class="form-control" name="manufactureEmail">
                </fieldset>
                <fieldset class="form-group">
                    <label>Phone</label> <input type="text"  class="form-control" name="manufacturePhone" >

                </fieldset>
                <fieldset class="form-group">
                    <label>Description</label> <textarea  class="form-control" name="description" ></textarea>
                </fieldset>
                <fieldset class="form-group">
                    <label>Details</label> <textarea  class="form-control" name="detail" ></textarea>
                </fieldset>
                <button type="submit" class="btn btn-success">Submit</button>
            </form>
        </div>
    </div>
</div>
</body>

</html>
