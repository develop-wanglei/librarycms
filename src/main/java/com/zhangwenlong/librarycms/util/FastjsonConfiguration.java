package com.zhangwenlong.librarycms.util;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter4;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: librarycms
 * @description: Fastjson配置
 * @author: wanglei
 * @create: 2020-01-09 21:45
 **/

//@Configuration
public class FastjsonConfiguration {
    @Bean
    public HttpMessageConverters fastjsonConverter() {
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        //自定义格式化输出
        fastJsonConfig.setSerializerFeatures(
                SerializerFeature.DisableCircularReferenceDetect);//禁止循环引用
        FastJsonHttpMessageConverter4 fastjson = new FastJsonHttpMessageConverter4();
        fastjson.setFastJsonConfig(fastJsonConfig);
        return new HttpMessageConverters(fastjson);
    }

}
