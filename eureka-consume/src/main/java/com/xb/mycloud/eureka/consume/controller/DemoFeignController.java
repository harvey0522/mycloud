package com.xb.mycloud.eureka.consume.controller;

import com.xb.mycloud.eureka.consume.feign.FeignProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
public class DemoFeignController {

    @Autowired
    private DiscoveryClient client;
    @Autowired
    private RestTemplate template;
    @Autowired
    private FeignProduct product;

    @RequestMapping("/get3")
    @ResponseBody
    public List get3(Integer id){
        System.out.println("DemoFeignController...."+id);
        return product.get(id);
    }

}
