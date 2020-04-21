package com.mr.music1.controller;

import com.mr.music1.entity.UserEntity;
import com.mr.music1.service.UserService;
import com.mr.music1.utils.ResultInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping("/Login")
    @ResponseBody()
    private ResultInfo listLogin(UserEntity u){
      return  service.listLogin(u);
    };

}
