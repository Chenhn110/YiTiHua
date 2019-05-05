package com.chenhn.service.serviceImple;

import com.chenhn.dao.UserDaoInterface;
import com.chenhn.entity.User;
import com.chenhn.service.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserSreviceImple implements UserServiceInterface {
    @Autowired
    UserDaoInterface userDaoInterface;

    @Override
    public User loginUser(String username, String password) {
        return userDaoInterface.loginUser(username,password);
    }
}
