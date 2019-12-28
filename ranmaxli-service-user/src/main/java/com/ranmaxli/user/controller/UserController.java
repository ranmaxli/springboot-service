package com.ranmaxli.user.controller;

import com.ranmaxli.api.code.CommonCode;
import com.ranmaxli.api.model.ReturnModel;

import com.ranmaxli.api.service.UserServices;
import com.ranmaxli.api.utils.StringUtil;
import com.ranmaxli.user.dto.User;
import com.ranmaxli.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController implements UserServices {

    @Autowired
    UserService userService;

    @Override
    public ReturnModel userLogin(String username,String password) {
        if(StringUtil.isNullOrEmpty(username)){
            return new ReturnModel(CommonCode.FAIL_CODE, CommonCode.EMPTY_DATA, CommonCode.MISSING_PARAM_MSG);
        }
        if(StringUtil.isNullOrEmpty(password)){
            return new ReturnModel(CommonCode.FAIL_CODE, CommonCode.EMPTY_DATA, CommonCode.MISSING_PARAM_MSG);
        }
        //deal service
        User users = userService.userLogin(username,password);
        if(users == null){
            return new ReturnModel(CommonCode.NO_FOUND_USER_CODE,CommonCode.EMPTY_DATA,CommonCode.NO_FOUND_USER_MSG);
        }
        return new ReturnModel(CommonCode.SUCCESS_CODE, users, CommonCode.SUCCESS_MSG);
    }

    @Override
    public ReturnModel insertUser(String username,String password,String displayName) {
        if(StringUtil.isNullOrEmpty(username)){
            return new ReturnModel(CommonCode.FAIL_CODE, CommonCode.EMPTY_DATA, CommonCode.MISSING_PARAM_MSG);
        }
        if(StringUtil.isNullOrEmpty(password)){
            return new ReturnModel(CommonCode.FAIL_CODE, CommonCode.EMPTY_DATA, CommonCode.MISSING_PARAM_MSG);
        }
        if(StringUtil.isNullOrEmpty(displayName)){
            return new ReturnModel(CommonCode.FAIL_CODE, CommonCode.EMPTY_DATA, CommonCode.MISSING_PARAM_MSG);
        }
        //deal service
        int userCount = userService.insertUser(username,password,displayName);
        if(userCount == 0){
            return new ReturnModel(CommonCode.INSERT_USER_FAIL_CODE,CommonCode.EMPTY_DATA,CommonCode.INSERT_USER_FAIL_MSG);
        }
        return new ReturnModel(CommonCode.SUCCESS_CODE, userCount, CommonCode.SUCCESS_MSG);
    }

    @Override
    public ReturnModel updatePassword(String username,String password,String oldPassword) {
        if(StringUtil.isNullOrEmpty(username)){
            return new ReturnModel(CommonCode.FAIL_CODE, CommonCode.EMPTY_DATA, CommonCode.MISSING_PARAM_MSG);
        }
        if(StringUtil.isNullOrEmpty(password)){
            return new ReturnModel(CommonCode.FAIL_CODE, CommonCode.EMPTY_DATA, CommonCode.MISSING_PARAM_MSG);
        }
        if(StringUtil.isNullOrEmpty(oldPassword)){
            return new ReturnModel(CommonCode.FAIL_CODE, CommonCode.EMPTY_DATA, CommonCode.MISSING_PARAM_MSG);
        }
        //deal service
        int userCount = userService.updatePassword(username,password,oldPassword);
        if(userCount == 0){
            return new ReturnModel(CommonCode.UPDATE_USER_FAIL_CODE,CommonCode.EMPTY_DATA,CommonCode.UPDATE_USER_FAIL_MSG);
        }
        return new ReturnModel(CommonCode.SUCCESS_CODE, userCount, CommonCode.SUCCESS_MSG);
    }

    @Override
    public ReturnModel deleteUser(String username,String password,String displayName) {
        if(StringUtil.isNullOrEmpty(username)){
            return new ReturnModel(CommonCode.FAIL_CODE, CommonCode.EMPTY_DATA, CommonCode.MISSING_PARAM_MSG);
        }
        if(StringUtil.isNullOrEmpty(password)){
            return new ReturnModel(CommonCode.FAIL_CODE, CommonCode.EMPTY_DATA, CommonCode.MISSING_PARAM_MSG);
        }
        if(StringUtil.isNullOrEmpty(displayName)){
            return new ReturnModel(CommonCode.FAIL_CODE, CommonCode.EMPTY_DATA, CommonCode.MISSING_PARAM_MSG);
        }
        //deal service
        int userCount = userService.deleteUser(username,password,displayName);
        if(userCount == 0){
            return new ReturnModel(CommonCode.DELETE_USER_FAIL_CODE,CommonCode.EMPTY_DATA,CommonCode.DELETE_USER_FAIL_MSG);
        }
        return new ReturnModel(CommonCode.SUCCESS_CODE, userCount, CommonCode.SUCCESS_MSG);
    }

}
