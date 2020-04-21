package com.mr.music1.service.impl;

import com.mr.music1.entity.UserEntity;
import com.mr.music1.mapper.UserMapper;
import com.mr.music1.service.UserService;
import com.mr.music1.utils.ResultInfo;
import jdk.nashorn.internal.ir.RuntimeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.net.ssl.SSLEngine;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;
import java.util.Enumeration;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper mapper;
    @Override
    public ResultInfo listLogin(UserEntity u) {

        ResultInfo r = new ResultInfo();

        UserEntity dbUser = mapper.listLogin(u);
        if (null == dbUser) {
            r.setCode(502);
            r.setCodeInfo("账号或密码错误");
            return r;
        }
        r.setCode(200);
        r.setCodeInfo("登入成功");

        HttpServletRequest request = ServletActionContext.getRequest();
        HttpServletResponse response = ServletActionContext.getResponse();
        HttpSession session = request.getSession(); //创建
        return null;

    }


}