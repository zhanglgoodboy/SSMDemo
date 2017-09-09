package org.lanqiao.dao;

import org.lanqiao.bean.Classes;
import org.lanqiao.bean.Student;

import java.util.List;

/**
 * Created by isyou on 2017/9/4.
 */
public interface IClassDao {
    /**
     * 查询所有的班级信息，包含班级老师的信息
     * @return
     */
        List<Classes> getAllClassInfo();

    /**
     * 根据id查询所有班级的学生信息
     * @param id
     * @return
     */
    List<Student> getClassInfoById(int id);
}
