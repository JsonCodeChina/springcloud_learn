package com.shenbo.cloud.providerdept8002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Providerdept8002Application {

    public static void main(String[] args) {
        SpringApplication.run(Providerdept8002Application.class, args);
    }

}
