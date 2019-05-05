package com.chenhn.service;

import com.chenhn.entity.User;
import org.apache.ibatis.annotations.Param;


public interface UserServiceInterface {
    User loginUser(@Param("username") String username, @Param("password") String password);
}
