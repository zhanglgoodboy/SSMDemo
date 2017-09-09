package org.lanqiao.controller;

import org.lanqiao.bean.User;
import org.lanqiao.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by isyou on 2017/9/1.
 */
@Controller         //告诉spring,这个类是一个controller
@RequestMapping("/test")    //请求地址
public class HelloController {
    @Autowired
    private IUserService IUserService;
    @RequestMapping("/hello.do")
    public ModelAndView hello(){
        ModelAndView view=new ModelAndView("hello");
        List<User> list=IUserService.getAllUser();
        view.addObject("list",list);
        return view;
        }

    @RequestMapping("/user.do")
    public String reg(User user){
        System.out.println("姓名："+user.getUserName()+"密码："+user.getUserPassword());
        System.out.println(user.getUserId()+2);
       // return "result";
        //重定向到hello.jsp,不经过解析器，请求的是地址
        return "redirect:/hello.jsp";
        //转发到hello.jsp
        //return "forward:/hello.jsp";
        }
        //查询所有的用户信息
    @RequestMapping("/user")
    @ResponseBody
    public List getUser(User user){
        List<User> list=IUserService.getUserByCondition(user);
        return list;
    }
    //根据ID查询用户的信息
    @RequestMapping(value = "/{userId}",method= RequestMethod.GET)
    @ResponseBody
    public User getUserById(@PathVariable  int userId){
        User user=IUserService.getUserById(userId);
        return user;
}
    //根据id删除某个用户
    public int delUserById(int userId){

        return 0;
    }
}
