package com.wj.web;

import com.wj.User;
import com.wj.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    public List<User> getAll(){
        return userService.getAll();
    }
}
