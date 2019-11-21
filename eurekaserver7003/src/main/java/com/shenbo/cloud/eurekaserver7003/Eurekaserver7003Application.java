package com.shenbo.cloud.eurekaserver7003;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Eurekaserver7003Application {

    public static void main(String[] args) {
        SpringApplication.run(Eurekaserver7003Application.class, args);
    }

}
