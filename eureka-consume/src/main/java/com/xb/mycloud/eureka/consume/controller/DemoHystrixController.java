package com.xb.mycloud.eureka.consume.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.xb.mycloud.eureka.consume.feign.FeignProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DemoHystrixController {

    @Autowired
    private DiscoveryClient client;
    @Autowired
    private RestTemplate template;
    @Autowired
    private FeignProduct product;

    @RequestMapping("/get4")
    @HystrixCommand(fallbackMethod ="callback" )
    public String get4(String param){
        System.out.println("DemoFeignController...."+param);
        int x=1/0;
        return product.get(param);
    }

    public String callback(String param){
        return "DemoHystrixController..over";
    }

}
