package org.lanqiao.dao;

import org.lanqiao.bean.User;

import java.util.List;

/**
 * Created by isyou on 2017/8/30.
 */
public interface IUserDao {
    /**
     * 查询所有的学生
     * @return 学生集合
     */
    List<User> getAllUser();

    /**
     * 根据id查询学生
     *@param id
     * @return
     */
    User getUserById(int id);

    /**
     * 根据id删除学生
     * @param id
     * @return
     */
    int delUser(int id);

    /**
     * 插入一个学生信息
     * @param user
     * @return
     */
    int addUser(User user);
    /**
     * 更新学生信息
     * @param user
     * @return
     */
    int upUser(User user);

    /**
     * 根据条件查询
     * @param user
     * @return
     */
    List<User> getUserByCondition(User user);

    /**
     * 根据多个用户id查询
     * @param list
     * @return
     */
    List<User> getUserIn(List<Integer> list);
}
