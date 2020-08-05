package com.example.service;

import com.example.entity.User;
import com.example.mapper.UserMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public List<User> getList(String p){
        p="%"+p+"%";
        //p = "(select 1 from  user1_tbl where username like '%m%')";
        String orderBy = " (select user())";
        return userMapper.getList(p,orderBy);
    }
}
