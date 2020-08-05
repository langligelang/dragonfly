package com.example.demo.ctl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.beans.User;
import com.example.demo.service.SQLService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class SQLCtl {

    @Autowired
    SQLService sqlService;


    @GetMapping("/inject")
    public String inject(String p){
        try {
            List<User> userList = sqlService.selectUserByName(p);
            return JSON.toJSONString(userList);
        }catch (Exception e){
            return "sql error :  "+e;
        }
    }

}
