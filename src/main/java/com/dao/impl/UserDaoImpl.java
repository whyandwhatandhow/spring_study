package com.dao.impl;

import com.dao.UserDao;
import com.domain.User;
import com.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Value("${jdbc.driver}")
    private String userDao_String;

    @Autowired
    private UserMapper userMapper;
    @Override
    public void show() {
        System.out.println(userDao_String);
        List<User> users = userMapper.findAll();
        for (User user : users) {
            System.out.println(user);
        }
    }

}
