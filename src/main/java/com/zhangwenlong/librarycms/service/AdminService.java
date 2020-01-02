package com.zhangwenlong.librarycms.service;

import com.zhangwenlong.librarycms.entity.Admin;

public interface AdminService {
    Admin login(String name, String password);
    Admin selectAdminById(Integer id);
    Integer updateAdmin(String password,Integer id);
    Integer insertAdmin(String name,String password);
}
