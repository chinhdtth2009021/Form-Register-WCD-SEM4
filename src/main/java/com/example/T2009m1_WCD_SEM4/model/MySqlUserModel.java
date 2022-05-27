package com.example.T2009m1_WCD_SEM4.model;

import com.example.T2009m1_WCD_SEM4.util.ConnectionHelper;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MySqlUserModel implements UserModel{
    private static  final String INSERT_USER = "INSERT INTO users (fullName, username, Email, passwordHash, status) VALUES  (?,?,?,?,?);";
    @Override
    public boolean save(User user) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = ConnectionHelper.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USER);
            preparedStatement.setString(1, user.getFullName());
            preparedStatement.setString(2, user.getUsername());
            preparedStatement.setString(3, user.getEmail());
            preparedStatement.setString(4, user.getPasswordHash());
            preparedStatement.setInt(5, user.getStatus());
            preparedStatement.executeUpdate();
            return true;
        }catch (SQLException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean update(int id, User updateUser) {
        Connection connection = ConnectionHelper.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("update sem-4 set fullName = ?, username = ?, email = ?, passwordHash = ?, status = ? where id = ?");
            preparedStatement.setString(1, updateUser.getFullName());
            preparedStatement.setString(2, updateUser.getUsername());
            preparedStatement.setString(3, updateUser.getEmail());
            preparedStatement.setString(4, updateUser.getPasswordHash());
            preparedStatement.setInt(5, updateUser.getStatus());
            preparedStatement.setInt(6, id);
            preparedStatement.execute();
            return true;
        }catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        Connection connection = ConnectionHelper.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("update sem-4 set status = ? where id = ?");
            preparedStatement.setInt(1, -1);
            preparedStatement.setInt(2, id);
            preparedStatement.execute();
            return true;
        }catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<User> findAll() {
        List<User> users = new ArrayList<>();
        try {
            Connection connection = ConnectionHelper.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("select * from sem-4 where status = ?");
            preparedStatement.setInt(1, 1);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String fullName = resultSet.getString("fullName");
                String username = resultSet.getString("username");
                String Email = resultSet.getString("Email");
                String passwordHash = resultSet.getString("passwordHash");
                int status = resultSet.getInt("status");
                User user = new User(id, fullName, username, Email, passwordHash, status);
                users.add(user);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return users;
    }

    @Override
    public User findById(int id) {
        try {
            Connection connection = ConnectionHelper.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("select * from sem-4 where status = ? and id = ?");
            preparedStatement.setInt(1, 1);
            preparedStatement.setInt(2, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                String fullName = resultSet.getString("fullName");
                String username = resultSet.getString("username");
                String Email = resultSet.getString("Email");
                String passwordHash = resultSet.getString("passwordHash");
                int status = resultSet.getInt("status");
                User user = new User(id, fullName, username, Email, passwordHash,status);
                return user;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
}
