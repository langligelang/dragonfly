package com.example.ctl;

import com.alibaba.fastjson.JSON;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("getList")
    public String getList(String p){
        return JSON.toJSONString(userService.getList(p));
    }
}
