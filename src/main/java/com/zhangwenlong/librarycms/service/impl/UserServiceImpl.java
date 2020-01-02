package com.zhangwenlong.librarycms.service.impl;

import com.zhangwenlong.librarycms.entity.User;
import com.zhangwenlong.librarycms.mapper.UserMapper;
import com.zhangwenlong.librarycms.service.UserService;
import com.zhangwenlong.librarycms.util.Md5Util;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: librarycms
 * @description: 用户业务逻辑层
 * @author: wanglei
 * @create: 2019-12-30 11:37
 **/
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper mapper;
    @Resource
    private Md5Util md5;//MD5加密工具类
    @Override
    public User login(String name, String password) {
        String pwd = md5.generate(password);//调用MD5中的加密方法
        return mapper.login(name,pwd);
    }

    @Override
    public List<User> selectUserAll() {
        return mapper.selectUserAll();
    }

    @Override
    public User selectUserById(Integer id) {
        return mapper.selectUserById(id);
    }

    @Override
    public Integer insertUser(String name, String password, Integer sex, String birthday) {
        String pwd = md5.generate(password);//调用MD5中的加密方法
        return mapper.insertUser(name,pwd,sex,birthday);
    }

    @Override
    public Integer updateUser(User user) {
        user.setPassword(md5.generate(user.getPassword()));
        return mapper.updateUser(user);
    }

    @Override
    public Integer deleteUserById(Integer id) {
        return mapper.deleteUserById(id);
    }
}
