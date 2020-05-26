package com.wj.service.impl;


import com.wj.User;
import com.wj.UserService;

import java.util.Arrays;
import java.util.List;

public class UserServiceImpl implements UserService {

    @Override
    public List<User> getAll() {
        User user1 = new User(1, "张三", 12, "北京");
        User user2 = new User(2, "李四", 13, "北京");
        return Arrays.asList(user1, user2);
    }
}
