package com.wei.webservicedemo.repository;

import com.wei.webservicedemo.Entities.Blogs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blogs, Integer> {
}
