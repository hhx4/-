package com.study.dao.impl;

import com.study.dao.UserDao;
import com.study.pojo.User;

/**
 * @program: bookstore
 * @description: UserDao实现类
 * @author: hw
 * @create: 2021-03-13 15:05
 **/
public class UserDaoImpl extends BaseDao implements UserDao {


    @Override
    public User queryUserByUsername(String username) {
        String sql = "select `id`,`username`,`password`,`email` from t_user where username = ?";
        return queryForOne(User.class,sql,username);
    }

    @Override
    public User queryUserByUsernameAndPassword(String username, String password) {
        String sql = "select `id`,`username`,`password`,`email` from t_user" +
                " where username = ? and password = ?";

        return queryForOne(User.class,sql,username,password);
    }

    @Override
    public int saveUser(User user) {
        String sql ="insert into t_user(`username`,`password`,`email`)" +
                "values(?,?,?)";
        return update(sql,user.getUsername(),user.getPassword(),user.getEmail());
    }
}
