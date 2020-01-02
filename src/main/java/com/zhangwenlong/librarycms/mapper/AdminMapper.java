package com.zhangwenlong.librarycms.mapper;

import com.zhangwenlong.librarycms.entity.Admin;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminMapper {
    Admin login(String name,String password);
    Admin selectAdminById(Integer id);
    Integer updateAdmin(String password,Integer id);
    Integer insertAdmin(String name,String password);
}
