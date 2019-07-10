package com.liulei.cloud.liuleispringcloudfeigh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author Vanessa
 */
@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class LiuleiSpringCloudFeighApplication {

    public static void main(String[] args) {
        SpringApplication.run(LiuleiSpringCloudFeighApplication.class, args);
    }

}
