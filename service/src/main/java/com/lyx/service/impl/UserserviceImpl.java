package com.lyx.service.impl;

import com.lyx.mapper.Usermapper;
import com.lyx.pojo.User;
import com.lyx.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserserviceImpl implements Userservice {

    @Autowired
    private Usermapper usermapper;

    public void adduser(User user) {
        usermapper.insertuser(user);
    }
}
