package com.clothesPlatform.service;

import com.clothesPlatform.entity.User;

public interface UserService {

    void findAll();

    boolean checkPassword(String userId,String password);

    boolean saveUser(User user);

    User findUser(String userId);
}
