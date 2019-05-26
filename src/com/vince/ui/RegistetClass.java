package com.vince.ui;

import com.vince.bean.User;
import com.vince.service.UserService;
import com.vince.service.impl.UserServiceImpl;
import com.vince.utils.BusinessException;

import java.io.IOException;

public class RegistetClass extends BaseClass {
    public void register() throws BusinessException, IOException {
        println(getString("input.username"));
        String username=input.nextLine();
        println(getString("input.password"));
        String password=input.nextLine();
        User user=new User(username,password);
        UserService userService=new UserServiceImpl();
        userService.register(user);
    }
}
