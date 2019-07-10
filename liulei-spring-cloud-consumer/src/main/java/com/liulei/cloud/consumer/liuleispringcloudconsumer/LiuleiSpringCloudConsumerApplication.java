package com.liulei.cloud.consumer.liuleispringcloudconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author Vanessa
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableCircuitBreaker
public class LiuleiSpringCloudConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LiuleiSpringCloudConsumerApplication.class, args);
    }

}
