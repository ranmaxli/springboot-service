package com.ranmaxli.core.controller;

import com.ranmaxli.api.model.ReturnModel;
import com.ranmaxli.api.service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    //autowired services
    @Autowired
    UserServices userServices;

    //interface
    @ResponseBody
    @RequestMapping("/login")
    public ReturnModel userLogin(String username,String password) {
        return userServices.userLogin(username,password);
    }

    @ResponseBody
    @RequestMapping("/insertUser")
    public ReturnModel insertUser(String username,String password,String displayName) {
        return userServices.insertUser(username,password,displayName);
    }

    @ResponseBody
    @RequestMapping("/updatePassword")
    public ReturnModel updatePassword(String username,String password,String oldPassword) {
        return userServices.updatePassword(username,password,oldPassword);
    }

    @ResponseBody
    @RequestMapping("/deleteUser")
    public ReturnModel deleteUser(String username,String password,String displayName) {
        return userServices.deleteUser(username,password,displayName);
    }
}
