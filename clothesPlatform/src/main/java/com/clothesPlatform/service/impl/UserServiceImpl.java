package com.clothesPlatform.service.impl;

import com.clothesPlatform.entity.User;
import com.clothesPlatform.repository.UserRepository;
import com.clothesPlatform.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public void findAll() {
        List<User> users=userRepository.findAll();
        users.forEach(System.out::println);
    }

    @Override
    public boolean checkPassword(String userId,String password) {
        Optional<User> op = userRepository.findById(userId);
        User user = op.get();
        if (user.getPassword().equals(password)){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean saveUser(User user) {
        Optional<User> op = userRepository.findById(user.getUserId());
        if (!op.isPresent()){
            userRepository.save(user);
            return true;
        } else{
            return false;
        }

    }

    @Override
    public User findUser(String userId) {
        Optional<User> user = userRepository.findById(userId);
        if (user.isPresent()){
            return user.get();
        }else {
            return null;
        }

    }
}
