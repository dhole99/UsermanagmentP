package com.geekster.UserManagment.controller;

import com.geekster.UserManagment.model.User;
import com.geekster.UserManagment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class UserController {
    @Autowired
    UserService userService;


    @PostMapping("user")
    public String addUser(@RequestBody User myUser){
        return userService.addUser(myUser);
    }
    @GetMapping("users")
    public Map<Integer,User> getAllusers(){
        return userService.getAllusers();
    }




}
