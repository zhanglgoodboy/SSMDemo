package org.lanqiao.bean;

/**
 * Created by isyou on 2017/8/30.
 */
public class User {
    private Integer userId;
    private String userName;
    private String userPassword;
    private String userHobby;
    private Integer userSex;
    public void printHello(){
        System.out.println("hello!"+userName);
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserHobby() {
        return userHobby;
    }

    public void setUserHobby(String userHobby) {
        this.userHobby = userHobby;
    }

    public Integer getUserSex() {
        return userSex;
    }

    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userHobby='" + userHobby + '\'' +
                ", userSex=" + userSex +
                '}';
    }
}
