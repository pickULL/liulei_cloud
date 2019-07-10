package com.liulei.cloud.consumer.liuleispringcloudconsumer.service;

import com.liulei.cloud.consumer.liuleispringcloudconsumer.entity.User;

/**
 * @author Vanessa
 */
public interface IUserService {
    /**
     * getOne
     * @param id id
     * @return User
     */
    User getOne(Long id);

    User getUser(Long id);


}
