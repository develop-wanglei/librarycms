package com.zhangwenlong.librarycms.control;

import com.alibaba.fastjson.JSONObject;
import com.zhangwenlong.librarycms.entity.User;
import com.zhangwenlong.librarycms.service.UserService;
import com.zhangwenlong.librarycms.util.RestfulUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: librarycms
 * @description: 用户控制层
 * @author: wanglei
 * @create: 2019-12-30 13:29
 **/
//跨域请求，前后端分离时候加
@CrossOrigin("*")
//控制层注解 且返回格式为JSON
@RestController
//value=URl请求地址，method=请求方式为POST
@RequestMapping(value = "/user",method = RequestMethod.POST)
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private RestfulUtil res;
//用户登录
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(String name,String password){
        User login = userService.login(name, password);
        if (login!=null){
            return res.success(login);
        }
        return res.error("用户名或密码错误");
    }

//    添加用户信息
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String add(String name,String password,Integer sex,String birthday){
        Integer i = userService.insertUser(name, password, sex, birthday);
        if(i>0){
            return res.success(i);
        }
        return res.error("添加失败");
    }
//    修改用户信息
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public String update(User user){
        Integer i = userService.updateUser(user);
        if (i>0){
            return res.success(i);
        }
        return res.error("修改失败");
    }
//    删除用户信息
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public String delete(Integer id){
        Integer i = userService.deleteUserById(id);
        if (i>0){
            return res.success(i);
        }
        return res.error("删除失败");
    }
//    修改用户密码
    @RequestMapping(value = "/updataPwd",method = RequestMethod.POST)
    public String upPwd(Integer id,String password){
        User user = new User();
        user.setPassword(password);
        user.setId(id);
        Integer i = userService.updateUser(user);
        if (i>0){
            return res.success(i);
        }
        return res.error("修改密码失败");
    }
}
