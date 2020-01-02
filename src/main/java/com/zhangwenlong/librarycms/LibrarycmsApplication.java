package com.zhangwenlong.librarycms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zhangwenlong.librarycms.mapper")
public class LibrarycmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibrarycmsApplication.class, args);
    }

}
