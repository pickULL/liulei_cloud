package com.liulei.cloud.consumer.liuleispringcloudconsumer.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liulei.cloud.consumer.liuleispringcloudconsumer.entity.User;
import com.liulei.cloud.consumer.liuleispringcloudconsumer.mapper.UserMapper;
import com.liulei.cloud.consumer.liuleispringcloudconsumer.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


/**
 * @author Vanessa
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements IUserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public User getOne(Long id) {
        return new User(123L,"你是谁",18,"miaoshu");
    }

    @Override
    public User getUser(Long id) {
        return userMapper.getUser(id);
    }

    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }
}
