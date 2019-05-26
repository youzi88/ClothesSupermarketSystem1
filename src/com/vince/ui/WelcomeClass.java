package com.vince.ui;

//import com.vince.ui.BaseClass;

import com.vince.utils.BusinessException;
import com.vince.utils.UserIo;

import java.io.IOException;

public class WelcomeClass extends BaseClass {
    public void start(){

        println(getString("info.welcome"));
        UserIo userIo=new UserIo();
        userIo.readUsers();
        boolean flag=true;
        while(flag){
            println(getString("info.login.reg"));

            println(getString("info.select"));
            String select=input.nextLine();

            switch(select){
                case "1":

                    try {
                        new LoginClass().login();
                        flag =false;
                        println(getString("login.success"));
                    }catch(BusinessException e){
                        print(getString(e.getMessage()));
                    }

                    break;
                case "2":
                    flag=false;
                    try {
                        new RegistetClass().register();
                        println(getString("reg.success"));
                        flag = false;
                    }catch(BusinessException | IOException e){
                        println(getString("reg.error"));
                    }
                    break;
                default:
                    println(getString("input.error"));
                    break;
            }
        }
    }
}
