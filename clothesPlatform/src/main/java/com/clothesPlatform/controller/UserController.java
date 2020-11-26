package com.clothesPlatform.controller;

import com.clothesPlatform.entity.User;
import com.clothesPlatform.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    //登录密码校验，传入的参数有账号，密码，登录成功后进入主界面，失败进入返回登录界面
    @GetMapping("/login")
    public String checkUser(@RequestParam("userId") String userid,@RequestParam("password") String password){
        if (userService.checkPassword(userid,password)){
            return "index";
        }else {
            return "login";
        }
    }

    //注册一个新账号，传入账号，密码和角色，创建成功进入登录界面，失败返回注册界面
    @GetMapping("/register")
    public String userRegister(@RequestParam("userId") String userid,@RequestParam("password") String password,@RequestParam("role") String role){
        User user  = new User();
        user.setUserId(userid);
        user.setPassword(password);
        user.setRole(role);
        if (userService.saveUser(user)){
            return "login";
        }else{
            return "register";
        }

    }

    //根据账号查询用户
    @RequestMapping("/findUser/{userId}")
    @ResponseBody
    public User findUser(@PathVariable("userId")String userId){
        User user = userService.findUser(userId);
        if (user != null){
            System.out.println(user.toString());
            return user;
        }else {
            return null;
        }
    }



}
