package com.xb.mycloud.eureka.consume.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "my-eureka-provide",fallback=HystrixFallbackByFeign.class)
public interface FeignProduct{
    @RequestMapping(value = "/product",method = RequestMethod.GET)
    public String get(@RequestParam("param") String param);
}
