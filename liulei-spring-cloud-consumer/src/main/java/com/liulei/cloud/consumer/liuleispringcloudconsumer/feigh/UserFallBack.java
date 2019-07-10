package com.liulei.cloud.consumer.liuleispringcloudconsumer.feigh;

import com.liulei.cloud.consumer.liuleispringcloudconsumer.entity.User;
import org.springframework.stereotype.Component;

/**
 * 降级处理的一些设置，如请求次数，请求时间什么的 TODO
 * @author Vanessa
 */
@Component
public class UserFallBack implements UserFeigh{
    @Override
    public User list() {
        User user = new User();
        user.setId(0L);
        user.setName("降级名");
        return user;
    }
}
