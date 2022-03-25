package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.UserModel;
import com.example.demo.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserService {

    @Autowired
    private UserRepository _userRepository;

    public Optional<UserModel> getUser(Integer id) {
        return _userRepository.findById(id);
    }

    public ArrayList<UserModel> getUsers() {
        return (ArrayList<UserModel>) _userRepository.findAll();
    }

    public UserModel add(@RequestBody UserModel user) {
        return _userRepository.save(user);
    }

}