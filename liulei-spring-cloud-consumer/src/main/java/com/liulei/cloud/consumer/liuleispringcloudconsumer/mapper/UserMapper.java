package com.liulei.cloud.consumer.liuleispringcloudconsumer.mapper;

import com.liulei.cloud.consumer.liuleispringcloudconsumer.entity.User;

/**
 * @author liulei
 * @date 2019/7/9 22:45
 */
public interface UserMapper {

    /**
     * getUser
     * @param id
     * @return
     */
    User getUser(Long id);
}
