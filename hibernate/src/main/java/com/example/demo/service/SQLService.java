package com.example.demo.service;


import com.example.demo.beans.User;
import com.example.demo.dao.SQLDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SQLService {

    @Autowired
    SQLDao sqlDao;

    public List<User> selectUserByName(String username){
        return sqlDao.selectUserByName(username);
    }


}
