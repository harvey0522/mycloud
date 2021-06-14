package com.xb.mycloud.eureka.consume.feign;

import java.util.ArrayList;
import java.util.List;

public class HystrixFallbackByFeign implements FeignProduct {
    @Override
    public List get(Integer id) {
        System.out.println("start 熔断");

        return new ArrayList();
    }
}
