package com.zhangwenlong.librarycms.mapper;

import com.zhangwenlong.librarycms.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    User login(String name,String password);
    List<User> selectUserAll();
    Integer insertUser(String name,String password,Integer sex,String birthday);
    Integer updateUser(User user);
    Integer deleteUserById(Integer id);
}
