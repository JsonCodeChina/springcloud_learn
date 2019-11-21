package com.shenbo.cloud.consumer8001deptfeign.service;


import com.shenbo.clould.entities.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(name = "DEPT-8001",fallbackFactory = DeptClientServiceFallBackFactory.class)
public interface DeptClientServer {

    @PostMapping("/dept/add")
    public boolean add(Dept dept);


    @GetMapping("/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id);


    @GetMapping("/dept/list")
    public List<Dept> list();

}
