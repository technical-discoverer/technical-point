package com.technical.point.eventpublishaware.service;

import com.technical.point.eventpublishaware.entity.UserInfo;
import com.technical.point.eventpublishaware.event.UserRegisterEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

/**
 * @Description 逻辑处理层
 * @Author gaogba
 * @Date 2020/8/28 18:17
 * @Version 1.0
 */
@Service
public class UserService implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher applicationEventPublisher;

    public boolean register(UserInfo user) {

        //用户注册
        System.out.println("[service]用户["  + user + "]注册成功！");

        //消息发布
        applicationEventPublisher.publishEvent(new UserRegisterEvent(this, user));

        return true;
    }



    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }
}
