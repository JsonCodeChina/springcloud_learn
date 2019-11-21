package com.shenbo.cloud.eurekaserver7002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Eurekaserver7002Application {

    public static void main(String[] args) {
        SpringApplication.run(Eurekaserver7002Application.class, args);
    }

}
