package com.xb.mycloud.eureka.consume;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MyEurekaConsumeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyEurekaConsumeApplication.class, args);
	}

}
