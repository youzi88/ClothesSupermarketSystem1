package com.vince.service;
import com.vince.bean.User;
import com.vince.utils.BusinessException;

import java.io.IOException;

public interface UserService {
    public User register(User user) throws BusinessException, IOException;
    public User login(String username,String password) throws BusinessException;
}
