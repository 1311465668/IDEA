package com.lyx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class pageController {
    @RequestMapping("/{page}")
    public String showpage(@PathVariable String page){
        System.out.println(page);
        return page;
    }
}
