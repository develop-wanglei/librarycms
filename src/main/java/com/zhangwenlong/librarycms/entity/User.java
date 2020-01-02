package com.zhangwenlong.librarycms.entity;

import java.util.List;
import java.util.Map;

/**
 * @program: librarycms
 * @description: 用户实体类
 * @author: wanglei
 * @create: 2019-12-30 13:26
 **/
public class User {
    private Integer id;
    private String name;
    private String password;
    private Integer sex;
    private String birthday;
    private List<Map<String,Object>> borrowBook;
    public User() {
    }

    public User(Integer id, String name, String password, Integer sex, String birthday, List<Map<String, Object>> borrowBook) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.sex = sex;
        this.birthday = birthday;
        this.borrowBook = borrowBook;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public List<Map<String, Object>> getBorrowBook() {
        return borrowBook;
    }

    public void setBorrowBook(List<Map<String, Object>> borrowBook) {
        this.borrowBook = borrowBook;
    }

    @Override
    public String
    toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", sex=" + sex +
                ", birthday='" + birthday + '\'' +
                ", borrowBook=" + borrowBook +
                '}';
    }
}
