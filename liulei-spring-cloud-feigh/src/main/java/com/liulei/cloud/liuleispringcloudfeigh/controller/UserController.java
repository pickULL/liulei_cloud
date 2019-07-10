package com.liulei.cloud.liuleispringcloudfeigh.controller;

import com.liulei.cloud.liuleispringcloudfeigh.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Vanessa
 */
@RestController
public class UserController {
    @GetMapping("/user/list")
    public User listUser(){
        return new User(1L,"小明");
    }
}
