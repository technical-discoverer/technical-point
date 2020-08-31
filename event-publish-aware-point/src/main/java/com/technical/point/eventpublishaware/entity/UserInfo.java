package com.technical.point.eventpublishaware.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * @Description 实体类
 * @Author gaogba
 * @Date 2020/8/28 18:30
 * @Version 1.0
 */
@Getter
@Setter
public class UserInfo {
    private Integer id;
    private String name;
    private String phoneNum;
    private String email;

    private String activateLinkAddress;//激活地址

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", email='" + email + '\'' +
                ", activateLinkAddress='" + activateLinkAddress + '\'' +
                '}';
    }
}
