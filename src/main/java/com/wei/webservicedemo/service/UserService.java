package com.wei.webservicedemo.service;

import com.wei.webservicedemo.Entities.Users;
import com.wei.webservicedemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserServiceInterface{

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<Users> getAllUsers() {
        return (List<Users>) userRepository.findAll();
    }

    @Override
    public Users addUser(Users user) {
        //TODO: add addresses?
        userRepository.save(user);

        return user;
    }

    @Override
    public Users getUserById(int id) {
        return userRepository.findById(id).get();
    }
}
