package com.liulei.cloud.consumer.liuleispringcloudconsumer.feigh;

import com.liulei.cloud.consumer.liuleispringcloudconsumer.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Vanessa
 */
@FeignClient(name = "liulei-spring-cloud-feign",fallback = UserFallBack.class)
public interface UserFeigh {
    /**
     * 远程调用
     * @return user
     */
    @RequestMapping(value = "/user/list",method = RequestMethod.GET)
    User list();
}
