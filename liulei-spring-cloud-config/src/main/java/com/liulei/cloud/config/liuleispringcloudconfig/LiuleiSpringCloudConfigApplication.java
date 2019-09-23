package com.liulei.cloud.config.liuleispringcloudconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author liulei
 * @date
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class LiuleiSpringCloudConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(LiuleiSpringCloudConfigApplication.class, args);
    }

}
