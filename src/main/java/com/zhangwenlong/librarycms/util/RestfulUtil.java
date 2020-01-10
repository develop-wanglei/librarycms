package com.zhangwenlong.librarycms.util;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.springframework.stereotype.Component;

import java.util.HashMap;


@Component
public class RestfulUtil {
    /**
     * 返回成功
     * @param obj
     * @return
     */
    public  String success(Object obj){
        JSONObject json = new JSONObject();
        HashMap<String, Object> map = new HashMap<>();
        map.put("code",0);
        map.put("data",obj);
        map.put("msg","操作成功");
//        json.put("code",0);
//        json.put("data",obj);
//        json.put("msg","操作成功");
        //SerializerFeature.DisableCircularReferenceDetect fastjson 关闭循环引用 防止（$ref": "$.data）
        return json.toJSONString(map, SerializerFeature.DisableCircularReferenceDetect);
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
