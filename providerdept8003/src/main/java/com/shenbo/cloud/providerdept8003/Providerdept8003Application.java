package com.shenbo.cloud.providerdept8003;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Providerdept8003Application {

    public static void main(String[] args) {
        SpringApplication.run(Providerdept8003Application.class, args);
    }

}
