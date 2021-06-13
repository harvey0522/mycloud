package com.xb.mycloud.eureka.consume.controller;

import org.boon.json.JsonFactory;
import org.boon.json.JsonParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
public class DemoEurekaConsumeController {

    @Autowired
    private DiscoveryClient client;
    @Autowired
    private RestTemplate template;

    @RequestMapping("/get")
    @ResponseBody
    public String get(){
        List<ServiceInstance> instances = client.getInstances("DUBBO-AUTO-CONFIGURATION-PROVIDER-DEMO");
        System.out.println("......"+instances.get(0).getUri());
        List list=template.getForObject(instances.get(0).getUri().toString().concat("/query?id=2"),List.class);
        System.out.println(list.toArray());
        return "hello";
    }

    @RequestMapping("/get2")
    @ResponseBody
    public List get2(String id){
        List list=template.getForObject("http://DUBBO-AUTO-CONFIGURATION-PROVIDER-DEMO/query?id="+id,List.class);
        System.out.println(list);
        return list;
    }
}
