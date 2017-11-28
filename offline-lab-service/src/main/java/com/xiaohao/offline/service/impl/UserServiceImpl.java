package com.xiaohao.offline.service.impl;

import com.xiaohao.offline.service.IUserService;
import com.xiaohao.offline.utils.ICacheService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by haozipu on 2016/7/1.
 */
public class UserServiceImpl implements IUserService {

    @Autowired
    ICacheService cacheService;

    @Override
    public String sayHello(String username) {



        return "hello "+username;
    }
}
