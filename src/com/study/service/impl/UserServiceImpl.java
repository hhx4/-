package com.study.service.impl;

import com.study.dao.UserDao;
import com.study.dao.impl.UserDaoImpl;
import com.study.pojo.User;
import com.study.service.UserService;

/**
 * @program: bookstore
 * @description: UserService测试
 * @author: hw
 * @create: 2021-03-13 16:11
 **/
public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl();

    @Override
    public void registUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    public User login(User user) {

        return userDao.queryUserByUsernameAndPassword(user.getUsername(), user.getPassword());
    }

    @Override
    public boolean existsUsername(String username) {
        if (userDao.queryUserByUsername(username) == null) {
            return false;
        }
        return true;
    }
}