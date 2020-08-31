package com.technical.point.eventpublishaware.controller;

import com.technical.point.eventpublishaware.entity.UserInfo;
import com.technical.point.eventpublishaware.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 用户中心UserController
 * @Author gaogba
 * @Date 2020/8/28 18:16
 * @Version 1.0
 */
@RestController
public class UserController {

    @Autowired
    private UserService userRegisterService;

    /**
     * 用户注册
     *
     * @param user
     * @return
     */
    @RequestMapping("/register")
    public String register(UserInfo user) {
        //进行注册
        userRegisterService.register(user);
        return "[UserController]注册用户成功！";
    }

    /**
     * 用户激活并发送短信通知
     *
     * @param linkAddress
     * @return
     */
    @RequestMapping("/activate")
    public String activate(String linkAddress) {
        userRegisterService.activate(linkAddress);
        return "[UserController]用户激活成功！";
    }

}
