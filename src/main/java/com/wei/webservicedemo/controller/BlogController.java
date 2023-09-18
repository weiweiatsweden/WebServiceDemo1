package com.wei.webservicedemo.controller;

import com.wei.webservicedemo.Entities.Blogs;
import com.wei.webservicedemo.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @PostMapping(value = "/newpost")
    @PreAuthorize("hasRole('ROLE_client_Users')")
    public ResponseEntity<Blogs> postNewBlogs(@RequestBody Blogs blog) {
        return ResponseEntity.status(HttpStatus.CREATED).body(blogService.addBlog(blog));
    }

    @GetMapping(value = "/posts")
    @PreAuthorize("hasRole('ROLE_client_Admin')")
    public ResponseEntity<List<Blogs>> getAllBlogs() {
        return ResponseEntity.ok(blogService.getAllBlogs());
    }

    @GetMapping(value = "/posts/{id}")
    @PreAuthorize("hasRole('ROLE_client_Admin')")
    public ResponseEntity<Blogs> getBlogById(@PathVariable("id") int id) {
        return ResponseEntity.ok(blogService.getBlogById(id));
    }


    @PutMapping(value = "/updatepost/{id}")
    @PreAuthorize("hasRole('ROLE_client_Users')")
    public ResponseEntity<Blogs> updateCustomerById(@RequestBody Blogs blog, @PathVariable("id") int id) {
        return ResponseEntity.ok(blogService.updateBlogById(blog, id));
    }
    @DeleteMapping(value = "deletepost/{id}")
    @PreAuthorize("hasRole('ROLE_client_Users')")
    public ResponseEntity<Void> deleteCar(@PathVariable("id") int id) {
        blogService.deleteBlogById(id);
        return ResponseEntity.noContent().build();
    }

}
