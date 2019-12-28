package com.ranmaxli.api.service;

import com.ranmaxli.api.model.ReturnModel;

public interface UserServices {

    ReturnModel userLogin(String username, String password);

    ReturnModel insertUser(String username,String password,String displayName);

    ReturnModel updatePassword(String username,String password,String oldPassword);

    ReturnModel deleteUser(String username,String password,String displayName);
}
