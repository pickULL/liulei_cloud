package com.liulei.cloud.consumer.liuleispringcloudconsumer.controller;

import com.liulei.cloud.consumer.liuleispringcloudconsumer.entity.User;
import com.liulei.cloud.consumer.liuleispringcloudconsumer.feigh.UserFeigh;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Vanessa
 */
@RestController
public class FeighController {
    @Autowired
    private UserFeigh userFeigh;
    @GetMapping("/feigh/list")
    public User list(){
        return userFeigh.list();
    }

}
