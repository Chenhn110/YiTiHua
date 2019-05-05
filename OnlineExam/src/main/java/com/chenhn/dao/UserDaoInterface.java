package com.chenhn.dao;


import com.chenhn.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDaoInterface {


    User loginUser(@Param("username") String username, @Param("password") String password);

}
