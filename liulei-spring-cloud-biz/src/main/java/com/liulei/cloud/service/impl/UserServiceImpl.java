package com.liulei.cloud.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liulei.cloud.entity.User;
import com.liulei.cloud.mapper.UserMapper;
import com.liulei.cloud.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liulei
 * @date 2019/12/3 11:46
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements IUserService {
    @Override
    public List<User> login(String username) {
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.eq("username",username);
        return list(userQueryWrapper);
    }
}
