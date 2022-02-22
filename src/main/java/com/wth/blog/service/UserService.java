package com.wth.blog.service;

import com.wth.blog.po.User;

public interface UserService {
    User checkUser(String username,String password);
}
