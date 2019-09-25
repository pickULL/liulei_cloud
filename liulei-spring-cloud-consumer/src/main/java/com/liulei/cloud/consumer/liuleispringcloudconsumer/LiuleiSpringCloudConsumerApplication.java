package com.liulei.cloud.consumer.liuleispringcloudconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Vanessa
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableCircuitBreaker
//@ComponentScan({"com.liulei.cloud.consumer"})
public class LiuleiSpringCloudConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LiuleiSpringCloudConsumerApplication.class, args);
    }

}
