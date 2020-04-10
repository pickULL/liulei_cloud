package com.liulei.cloud.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liulei.cloud.entity.User;

import java.util.List;

/**
 * @author liulei
 * @date 2019/12/3 11:45
 */
public interface IUserService extends IService<User> {
    List<User> login(String username);
}
