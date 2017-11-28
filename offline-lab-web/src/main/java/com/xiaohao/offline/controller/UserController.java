package com.xiaohao.offline.controller;

import com.xiaohao.offline.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by haozipu on 2016/7/1.
 */
@Controller
public class UserController {

    @Autowired
    IUserService userService;



}
