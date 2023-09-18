package com.wei.webservicedemo.service;

import com.wei.webservicedemo.Entities.Blogs;


import java.util.List;

public interface BlogServiceInterface {
    List<Blogs> getAllBlogs();
    Blogs addBlog(Blogs blog);
    Blogs getBlogById(int id);
    Blogs deleteBlogById(int id);
    Blogs updateBlogById(Blogs blog, int id);
}
