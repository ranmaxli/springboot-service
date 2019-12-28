package com.ranmaxli.user.dao;

import com.ranmaxli.user.dto.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    User userLogin(@Param("username") String username, @Param("password")String password);

    int insertUser(@Param("username") String username, @Param("password")String password,@Param("displayName")String displayName);

    int updatePassword(@Param("username") String username, @Param("password")String password,@Param("oldPassword")String oldPassword);

    int deleteUser(@Param("username") String username, @Param("password")String password,@Param("displayName")String displayName);

}
