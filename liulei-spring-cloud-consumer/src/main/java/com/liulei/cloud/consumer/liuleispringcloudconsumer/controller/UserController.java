package com.liulei.cloud.consumer.liuleispringcloudconsumer.controller;

import com.liulei.cloud.consumer.liuleispringcloudconsumer.entity.User;
import com.liulei.cloud.consumer.liuleispringcloudconsumer.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Vanessa
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/detail/{id}")
    public User getOne(@PathVariable Long id) {
        return userService.getOne(id);
    }

    @GetMapping("/getOne/{id}")
    public User getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }
}
