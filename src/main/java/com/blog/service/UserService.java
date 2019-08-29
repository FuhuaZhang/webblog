package com.blog.service;

import com.blog.bean.User;
import com.blog.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public void add(User user) {
        userMapper.insert(user);
    }

}
