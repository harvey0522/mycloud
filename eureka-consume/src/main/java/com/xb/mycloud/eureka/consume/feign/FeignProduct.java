package com.xb.mycloud.eureka.consume.feign;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "DUBBO-AUTO-CONFIGURATION-PROVIDER-DEMO",fallback=HystrixFallbackByFeign.class)
public interface FeignProduct{
    @RequestMapping(value = "/query",method = RequestMethod.GET)
    public List get(@RequestParam("id") Integer id);
}
