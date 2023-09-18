package com.wei.webservicedemo.Entities;

import javax.persistence.*;

@Entity
@Table

public class Blogs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "blogID")
    private int blogID;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "userID")
    private Users users;

    private String blogText;

    public Blogs() {
    }

    public Blogs(int blogID, Users users, String blogText) {
        this.blogID = blogID;
        this.users = users;
        this.blogText = blogText;
    }

    public int getBlogID() {
        return blogID;
    }

    public void setBlogID(int blogID) {
        this.blogID = blogID;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public String getBlogText() {
        return blogText;
    }

    public void setBlogText(String blogText) {
        this.blogText = blogText;
    }
}
