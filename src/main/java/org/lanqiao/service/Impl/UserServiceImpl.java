package org.lanqiao.service.Impl;

import org.apache.log4j.Logger;
import org.lanqiao.bean.User;
import org.lanqiao.dao.IUserDao;
import org.lanqiao.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Created by isyou on 2017/8/30.
 */
@Service //告诉spring 这是一个service 同时把这个类注册到spring
public class UserServiceImpl implements IUserService {
    //    创建logger对象
       Logger logger=Logger.getLogger(UserServiceImpl.class);
    @Autowired  //让spring注入一个dao  autowired会根据类型去匹配对应的对象
    private IUserDao userDao;

    public List<User> getAllUser() {
        return userDao.getAllUser();
    }

    public List<User> getUserByCondition(User user) {
        logger.info("麻瓜...............");
        return userDao.getUserByCondition(user);
    }

    public User getUserById(int userId) {
        return userDao.getUserById(userId);
    }

    public int delUser(int userId) {
        return userDao.delUser(userId);
    }

    public int addUser(User user) {
        return 0;
    }

    public int upUser(User user) {
        return 0;
    }
}