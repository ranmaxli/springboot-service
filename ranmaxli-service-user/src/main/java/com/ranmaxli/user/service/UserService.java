package com.ranmaxli.user.service;

import com.ranmaxli.user.dao.UserMapper;
import com.ranmaxli.user.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    /**
     * userlogin
     * @param username
     * @param password
     * @return
     */
    public User userLogin(String username, String password){
        User users = userMapper.userLogin(username,password);
        return users;
    }

    /**
     * insertUser
     * @param username
     * @param password
     * @param displayName
     * @return
     */
    public int insertUser(String username,String password,String displayName){
        int userCount = userMapper.insertUser(username,password,displayName);
        return userCount;
    }

    /**
     * updatePassword
     * @param username
     * @param password
     * @param oldPassword
     * @return
     */
    public int updatePassword(String username,String password,String oldPassword){
        int userCount = userMapper.updatePassword(username,password,oldPassword);
        return userCount;
    }

    /**
     * deleteUser
     * @param username
     * @param password
     * @param displayName
     * @return
     */
    public int deleteUser(String username,String password,String displayName){
        int userCount = userMapper.deleteUser(username,password,displayName);
        return userCount;
    }
}
