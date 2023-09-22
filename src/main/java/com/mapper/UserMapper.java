package com.mapper;

import com.domain.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


import java.util.List;


public interface UserMapper {
    @Select("select * from login")
    List<User> findAll();
}
