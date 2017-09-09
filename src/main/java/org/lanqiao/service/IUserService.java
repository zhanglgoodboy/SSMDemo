package org.lanqiao.service;

import org.lanqiao.bean.User;

import java.util.List;

/**
 * Created by isyou on 2017/8/30.
 */
public interface IUserService {
    //查询所有用户
    List<User> getAllUser();
    //根据条件查询用户信息
    List<User> getUserByCondition(User user);
    //根据id查询用户信息
    User getUserById(int userId);
    //根据id删除某个用户
    int  delUser(int userId);
    //添加一个用户
    int addUser(User user);
    //更新用户信息
    int upUser(User user);
}
