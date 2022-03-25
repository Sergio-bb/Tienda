package com.example.demo.controllers;

import java.util.List;

import com.example.demo.models.UserModel;
import com.example.demo.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Users/")
public class UserController {
    @Autowired
    private UserService _userService;
    @PostMapping("Add")
    public UserModel add(UserModel user){        
        if(user != null){
            return _userService.add(user);
        }else{
            return null;
        }
    }

    @GetMapping("GetAll")
    public List<UserModel> getAll(){
        return _userService.getUsers();
    }
}
