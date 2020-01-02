package com.zhangwenlong.librarycms.service.impl;

import com.zhangwenlong.librarycms.entity.Admin;
import com.zhangwenlong.librarycms.mapper.AdminMapper;
import com.zhangwenlong.librarycms.service.AdminService;
import com.zhangwenlong.librarycms.util.Md5Util;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: librarycms
 * @description: 管理员业务逻辑类
 * @author: wanglei
 * @create: 2019-12-30 16:43
 **/
@Service
public class AdminServiceImpl implements AdminService {

    @Resource
    private AdminMapper adminMapper;
    @Resource
    private Md5Util md5;

    @Override
    public Admin login(String name, String password) {
        String pwd = md5.generate(password);
        return adminMapper.login(name,pwd);
    }

    @Override
    public Admin selectAdminById(Integer id) {
        return adminMapper.selectAdminById(id);
    }

    @Override
    public Integer updateAdmin(String password, Integer id) {
        String pwd = md5.generate(password);
        return adminMapper.updateAdmin(pwd,id);
    }

    @Override
    public Integer insertAdmin(String name, String password) {
        String pwd = md5.generate(password);
        return adminMapper.insertAdmin(name,pwd);
    }
}
