package com.demo.practice.web.controller;

import com.demo.practice.common.entity.dos.UserDO;
import com.demo.practice.common.rsp.Response;
import com.demo.practice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
@ResponseBody
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping("/get")
    public Response<UserDO> getUser() {
        UserDO user = userService.getUser(1);
        return Response.of(user);
    }
}
