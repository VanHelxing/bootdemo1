package com.helsing.van.bootdemo.service;

import com.helsing.van.bootdemo.dao.UserDao;
import com.helsing.van.bootdemo.entity.User;
import com.yyfly.common.repository.BaseRepository;
import com.yyfly.common.service.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : yangjunqing
 * @version : 1.0
 * @ClassName UserServiceImpl
 * @Date : 2019/1/3 17:06
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    protected BaseRepository<User> getDao() {
        return userDao;
    }
}
