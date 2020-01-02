package com.zhangwenlong.librarycms.service;

import com.zhangwenlong.librarycms.entity.User;

import java.util.List;

public interface UserService {
    User login(String name, String password);
    List<User> selectUserAll();
    User selectUserById(Integer id);
    Integer insertUser(String name,String password,Integer sex,String birthday);
    Integer updateUser(User user);
    Integer deleteUserById(Integer id);
}
