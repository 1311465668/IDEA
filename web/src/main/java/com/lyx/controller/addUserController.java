package com.lyx.controller;

import com.lyx.pojo.User;
import com.lyx.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/user")
@Controller
public class addUserController {

    @Autowired
    private Userservice userservice;

    //springmvc  会自动将form表单上的name跟user的变量属性一样的注入到入参中去
    @RequestMapping("/addUser")
    public String adduser(User user){
        userservice.adduser(user);
        return "ok";
    }
}
