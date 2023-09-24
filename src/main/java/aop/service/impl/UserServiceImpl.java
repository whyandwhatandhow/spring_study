package aop.service.impl;

import aop.mapper.AccountMapper;
import aop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private AccountMapper accountMapper;
    @Override
    @Transactional
    public void transferMoney(String outAccount, String inAccount, Integer money) {
        //这两个是一个事务
        //开启事务
        accountMapper.increaseMoney(inAccount,money);
//        int i=1/0;
        accountMapper.decriceMoney(outAccount,money);
    }
}
