package com.wj;

import com.wj.web.UserController;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

public class ConsumerMain {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserController bean = context.getBean(UserController.class);
        List<User> users = bean.getAll();
        for (User user : users) {
            System.out.println(user);
        }
        System.in.read();
    }
}
