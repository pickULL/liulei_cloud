package com.liulei.cloud.consumer.liuleispringcloudconsumer.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liulei.cloud.consumer.liuleispringcloudconsumer.entity.User;

import java.util.List;

/**
 * @author liulei
 * @date 2019/7/9 22:45
 */
public interface UserMapper extends BaseMapper<User> {

    /**
     * getUser
     * @param id
     * @return
     */
    User getUser(Long id);

    List<User> getAll();

}
