package com.shenbo.cloud.consumer8001deptfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Consumer8001deptfeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(Consumer8001deptfeignApplication.class, args);
    }

}
