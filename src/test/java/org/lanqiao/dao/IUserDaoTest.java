package org.lanqiao.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lanqiao.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.swing.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by isyou on 2017/9/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class IUserDaoTest {
    @Autowired
    IUserDao userDao;
    @Test
    public void getAllUser() throws Exception {

    }

    @Test
    public void upUser() throws Exception {
            User user=new User();
            user.setUserId(4);
            user.setUserName("宅na");
            user.setUserPassword("777");
            user.setUserSex(0);
            userDao.upUser(user);
    }
    @Test
    public void getUserIn() throws Exception {
        List<Integer> list=new ArrayList<Integer>();
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(userDao.getUserIn(list));
    }

}