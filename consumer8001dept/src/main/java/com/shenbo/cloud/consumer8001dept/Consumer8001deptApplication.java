package com.shenbo.cloud.consumer8001dept;

import com.shenbo.cloud.rule2loadbalanced.MyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;


@RibbonClient(name = "DEPT-8001", configuration = MyRule.class)
@SpringBootApplication
public class Consumer8001deptApplication {

    public static void main(String[] args) {
        SpringApplication.run(Consumer8001deptApplication.class, args);
    }

}
