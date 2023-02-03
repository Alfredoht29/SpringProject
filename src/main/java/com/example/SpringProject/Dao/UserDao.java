package com.example.SpringProject.Dao;

import com.example.SpringProject.DbConfig;
import com.example.SpringProject.modelos.User;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    public List<User> getUsers() throws SQLException {
        List<User> userList=new ArrayList();
        Connection connection= DbConfig.getConnection();
        Statement sql = connection.createStatement();
        ResultSet rs = sql.executeQuery("SELECT * FROM user");
        while (rs.next()){
            User user = new User();
            user.setId((rs.getInt("Id")));
            user.setUsernames(rs.getString("Usernames"));
            user.setPhonenumber(rs.getString("Phonenumber"));
            user.setEmail(rs.getString("Email"));
            userList.add(user);
        }
        return userList;
    }
}
