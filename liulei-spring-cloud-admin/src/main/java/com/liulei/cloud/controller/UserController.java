package com.liulei.cloud.controller;

import com.liulei.cloud.entity.User;
import com.liulei.cloud.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liulei
 * @date 2020/3/25 17:25
 */
@RestController("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("/getOne/{id}")
    public User getOne(@PathVariable("id") Long id){
       return userService.getById(id);
    }
}
