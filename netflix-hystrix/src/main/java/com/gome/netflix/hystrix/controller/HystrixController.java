package com.gome.netflix.hystrix.controller;

import com.gome.netflix.hystrix.service.HystrixService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author LiTao
 * @Date 2016-11-25
 * @Email litao28@gome.com.cn
 * @Desc
 */

@RestController
public class HystrixController {

    @Autowired
    private HystrixService service;
    /**
     * 调用依赖的服务
     */
    @RequestMapping("/call")
    public String callDependencyService(){
        return service.callDependencyService();
    }
}