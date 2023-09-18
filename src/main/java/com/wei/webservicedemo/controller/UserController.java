package com.wei.webservicedemo.controller;

import com.wei.webservicedemo.Entities.Users;
import com.wei.webservicedemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/newuser")
    @PreAuthorize("hasRole('ROLE_client_Admin')")
    public ResponseEntity<Users> postNewUser(@RequestBody Users users){
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.addUser(users));
    }

    @GetMapping(value = "/users")
    @PreAuthorize("hasRole('ROLE_client_Admin')")
    public ResponseEntity<List<Users>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @GetMapping(value = "/users/{id}")
    @PreAuthorize("hasRole('ROLE_client_Admin')")
    public ResponseEntity<Users> getUserById(@PathVariable("id") int id) {
        return ResponseEntity.ok(userService.getUserById(id));
    }

}
