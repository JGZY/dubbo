package com.wj.dubbo.web;

import com.wj.User;
import com.wj.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Reference  //远程引用userService
    UserService userService;
    @RequestMapping("/getAll")
    @ResponseBody
    public List<User> getAll(){
        return userService.getAll();
    }
}
