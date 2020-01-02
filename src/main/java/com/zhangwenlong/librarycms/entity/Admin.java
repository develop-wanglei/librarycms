package com.zhangwenlong.librarycms.entity;

/**
 * @program: librarycms
 * @description: 管理员实体类
 * @author: wanglei
 * @create: 2019-12-30 13:16
 **/
public class Admin {
    private Integer id;
    private String name;
    private String password;
    private Integer authority;

    public Admin() {
    }

    public Admin(Integer id, String name, String password, Integer authority) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.authority = authority;
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

    public Integer getAuthority() {
        return authority;
    }

    public void setAuthority(Integer authority) {
        this.authority = authority;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", authority=" + authority +
                '}';
    }
}
