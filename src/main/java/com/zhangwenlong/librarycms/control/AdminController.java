package com.zhangwenlong.librarycms.control;

import com.zhangwenlong.librarycms.entity.Admin;
import com.zhangwenlong.librarycms.service.AdminService;
import com.zhangwenlong.librarycms.util.RestfulUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: librarycms
 * @description: 管理员控制层
 * @author: wanglei
 * @create: 2019-12-31 11:08
 **/
@CrossOrigin("*")
@RestController
@RequestMapping(value = "/admin",method = RequestMethod.POST)
public class AdminController {

    @Autowired
    private AdminService adminService;
    @Autowired
    private RestfulUtil res;
//    管理员登录
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(String name,String password){
        Admin login = adminService.login(name, password);
        if (login!=null){
            return res.success(login);
        }
        return res.error("登录失败");
    }
//    添加管理员
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String add(String name,String password){
        Integer i = adminService.insertAdmin(name, password);
        if (i>0){
            return res.success(i);
        }
        return res.error("添加失败");
    }
//    修改管理员密码
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public String update(Integer id,String password){
        Integer i = adminService.updateAdmin(password, id);
        if (i>0){
            return res.success(i);
        }
        return res.error("修改失败");
    }
//    查看管理员自己信息
    @RequestMapping(value = "/myselfInfo",method = RequestMethod.POST)
    public String myself(Integer id){
        Admin admin = adminService.selectAdminById(id);
        if (admin!=null){
            return res.success(admin);
        }
        return res.error("未查到数据");
    }
}
