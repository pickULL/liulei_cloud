package com.liulei.cloud.consumer.liuleispringcloudconsumer.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liulei.cloud.consumer.liuleispringcloudconsumer.entity.User;

import java.util.List;

/**
 * @author Vanessa
 */
public interface IUserService extends IService<User> {
    /**
     * getOne
     * @param id id
     * @return User
     */
    User getOne(Long id);

    User getUser(Long id);

    List<User> getAll();


}
