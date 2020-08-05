package com.example.mapper;

import com.example.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserMapper {

    List<User> getList(@Param(value="p")String p,@Param(value="orderby")String orderby);


}
