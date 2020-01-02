package com.zhangwenlong.librarycms.util;

import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;


@Component
public class Md5Util {

    public  String generate(String password) {
        password=password+"slat=zhangwenlong";
        String md5 = DigestUtils.md5DigestAsHex(password.getBytes());
        return md5;
    }


}
