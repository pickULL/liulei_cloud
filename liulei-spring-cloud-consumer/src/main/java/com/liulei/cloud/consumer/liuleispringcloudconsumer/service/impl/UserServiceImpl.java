package com.liulei.cloud.consumer.liuleispringcloudconsumer.service.impl;

import com.liulei.cloud.consumer.liuleispringcloudconsumer.entity.User;
import com.liulei.cloud.consumer.liuleispringcloudconsumer.mapper.UserMapper;
import com.liulei.cloud.consumer.liuleispringcloudconsumer.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * @author Vanessa
 */
@Service
public class UserServiceImpl implements IUserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public User getOne(Long id) {
        return new User(123L,"你是谁");
    }

    @Override
    public User getUser(Long id) {
        return userMapper.getUser(id);
    }
}
