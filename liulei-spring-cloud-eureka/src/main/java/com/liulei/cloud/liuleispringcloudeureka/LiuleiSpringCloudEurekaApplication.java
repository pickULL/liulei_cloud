package com.liulei.cloud.liuleispringcloudeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Vanessa
 */
@SpringBootApplication
@EnableEurekaServer
public class LiuleiSpringCloudEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(LiuleiSpringCloudEurekaApplication.class, args);
    }

}
