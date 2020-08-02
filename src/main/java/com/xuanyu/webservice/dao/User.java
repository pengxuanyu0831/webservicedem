package com.xuanyu.webservice.dao;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
//    private static final long seriaVersionID =

    private Long userId;

    private String userName;

    private String userEmail;

    private Date userDate;

    public String getUserName(){
        return userName;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public Long getUserId(){
        return userId;
    }

    public void setUserId(Long userId){
        this.userId = userId;
    }

    public String getUserEmail(){
        return userEmail;
    }

    public void setUserEmail(String userEmail){
        this.userEmail=userEmail;
    }

    public Date getUserDate(){
        return userDate;
    }

    public void setUserDate(Date userDate){
        this.userDate = userDate;
    }
}
