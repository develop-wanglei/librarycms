package com.zhangwenlong.librarycms.entity;


import java.util.List;

/**
 * @program: librarycms
 * @description: 图书借阅实体类
 * @author: wanglei
 * @create: 2019-12-30 13:24
 **/

public class BorrowBook {
    private Integer id;
    private Integer user_id;
    private Integer book_id;
    private String start_time;
    private String end_time;
    private Integer scop;
    private User user;
    private Book book;

    public BorrowBook() {
    }

    public BorrowBook(Integer id, Integer user_id, Integer book_id, String start_time, String end_time, Integer scop, User user, Book book) {
        this.id = id;
        this.user_id = user_id;
        this.book_id = book_id;
        this.start_time = start_time;
        this.end_time = end_time;
        this.scop = scop;
        this.user = user;
        this.book = book;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getBook_id() {
        return book_id;
    }

    public void setBook_id(Integer book_id) {
        this.book_id = book_id;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public Integer getScop() {
        return scop;
    }

    public void setScop(Integer scop) {
        this.scop = scop;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
