package com.gome.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author LiTao
 * @Date 2016-11-24
 * @Email litao28@gome.com.cn
 * @Desc
 */

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientApplication01 {

    public static void main(String[] args) {

        SpringApplication.run(EurekaClientApplication01.class);
    }
}
