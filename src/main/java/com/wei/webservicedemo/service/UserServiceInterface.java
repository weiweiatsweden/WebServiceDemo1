package com.wei.webservicedemo.service;

import com.wei.webservicedemo.Entities.Users;

import java.util.List;

public interface UserServiceInterface {
    List<Users> getAllUsers();
    Users addUser(Users user);
    Users getUserById(int id);
}
