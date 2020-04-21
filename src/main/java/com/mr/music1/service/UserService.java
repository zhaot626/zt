package com.mr.music1.service;

import com.mr.music1.entity.UserEntity;
import com.mr.music1.utils.ResultInfo;

public interface UserService {
    ResultInfo listLogin(UserEntity u);
}
