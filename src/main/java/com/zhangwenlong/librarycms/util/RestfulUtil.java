package com.zhangwenlong.librarycms.util;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Component;

@Component
public class RestfulUtil {
    /**
     * 返回成功
     * @param obj
     * @return
     */
    public  String success(Object obj){
        JSONObject json = new JSONObject();
        json.put("code",0);
        json.put("data",obj);
        json.put("msg","操作成功");
        return json.toString();
    }

    /**
     * 返回失败
     * @param msg
     * @return
     */
    public  String error(String msg){
        JSONObject json = new JSONObject();
        json.put("code",1);
        json.put("msg",msg);
        return json.toString();
    }


    public  String verify(String msg){
        JSONObject json = new JSONObject();
        json.put("code",-1);
        json.put("msg",msg);
        return json.toString();
    }

}
