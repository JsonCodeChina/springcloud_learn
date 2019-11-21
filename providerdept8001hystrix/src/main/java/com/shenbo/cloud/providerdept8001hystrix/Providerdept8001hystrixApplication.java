package com.shenbo.cloud.providerdept8001hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableDiscoveryClient
@SpringBootApplication
@EnableCircuitBreaker
public class Providerdept8001hystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(Providerdept8001hystrixApplication.class, args);
    }

}
