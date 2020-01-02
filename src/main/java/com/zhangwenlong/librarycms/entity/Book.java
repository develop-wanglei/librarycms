package com.zhangwenlong.librarycms.entity;

/**
 * @program: librarycms
 * @description: 图书实体类
 * @author: wanglei
 * @create: 2019-12-30 13:19
 **/
public class Book {
    private Integer id;
    private String book_name;
    private String book_author;
    private String book_price;
    private String book_press;
    private Integer scop;

    public Book() {
    }

    public Book(Integer id, String book_name, String book_author, String book_price, String book_press, Integer scop) {
        this.id = id;
        this.book_name = book_name;
        this.book_author = book_author;
        this.book_price = book_price;
        this.book_press = book_press;
        this.scop = scop;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getBook_author() {
        return book_author;
    }

    public void setBook_author(String book_author) {
        this.book_author = book_author;
    }

    public String getBook_price() {
        return book_price;
    }

    public void setBook_price(String book_price) {
        this.book_price = book_price;
    }

    public String getBook_press() {
        return book_press;
    }

    public void setBook_press(String book_press) {
        this.book_press = book_press;
    }

    public Integer getScop() {
        return scop;
    }

    public void setScop(Integer scop) {
        this.scop = scop;
    }
}
