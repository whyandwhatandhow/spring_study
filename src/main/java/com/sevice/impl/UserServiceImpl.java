package com.sevice.impl;

import com.dao.UserDao;
import com.sevice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
//    或者@ReSource(name="")
    @Autowired
    private UserDao userDao;

    @Override
    public void show() {
        System.out.println("this is service");
        userDao.show();
    }


}
