package com.demo.practice.common.entity.dos;

import lombok.Data;


@Data
public class UserDO {

    private int id;
    private String username;
    private String nickname;
    private String phone;
    private String email;
    private String password;
}
