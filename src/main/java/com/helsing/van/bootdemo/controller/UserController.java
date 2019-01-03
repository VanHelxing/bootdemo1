package com.helsing.van.bootdemo.controller;

import com.helsing.van.bootdemo.entity.User;
import com.helsing.van.bootdemo.service.UserService;
import com.yyfly.common.util.SpringContextUtils;
import com.yyfly.common.web.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author : yangjunqing
 * @version : 1.0
 * @ClassName UserController
 * @Date : 2019/1/3 17:08
 */
@Controller
public class UserController extends BaseController {

    @Autowired
    private UserService userService;


    @GetMapping("user/{id}")
    @ResponseBody
    public User getUser(@PathVariable("id") String id){
        return userService.findById(id);
    }


    @GetMapping("user/add")
    @ResponseBody
    public User add(User user){
        return userService.save(user);
    }


    @GetMapping("user2/{id}")
    public User getUser2(@PathVariable("id") String id){
        UserService userService2 = SpringContextUtils.getBean(UserService.class);
        return userService2.findById(id);
    }
}
