package com.xb.mycloud.eureka.consume.feign;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class HystrixFallbackByFeign implements FeignProduct {
    public HystrixFallbackByFeign(){
        System.out.println("HystrixFallbackByFeign....init");
    }
    @Override
    public String get(String param) {
        System.out.println("start 熔断"+param);

        return "myhystrix_error";
    }
}
