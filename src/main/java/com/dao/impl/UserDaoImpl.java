package com.dao.impl;

import com.dao.UserDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Value("${jdbc.driver}")
    private String userDao_String;


    @Override
    public void show() {
        System.out.println(userDao_String);
    }
}
