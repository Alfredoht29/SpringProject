package com.example.SpringProject.controllers;

import com.example.SpringProject.Dao.UserDao;
import com.example.SpringProject.modelos.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @GetMapping("usuarios")
    public List<User> xd() throws SQLException {
        UserDao get = new UserDao();
        List<User> userlist = new ArrayList();
        userlist=get.getUsers();
        return userlist;
    }
}
