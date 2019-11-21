package com.shenbo.cloud.providerdept8003.controller;







import com.shenbo.cloud.providerdept8003.sercive.DeptService;
import com.shenbo.clould.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @Autowired
    private DiscoveryClient client;

    @PostMapping("/dept/add")
    public boolean add(Dept dept){
        return deptService.add(dept);
    }


    @GetMapping("/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return deptService.get(id);
    }


    @GetMapping("/dept/list")
    public List<Dept> list(){
        return deptService.list();
    }

    @RequestMapping(value = "/dept/discovery", method = RequestMethod.GET)
    public Object discovery()
    {
        List<String> list = client.getServices();
        System.out.println("**********" + list);

        List<ServiceInstance> srvList = client.getInstances("DEPT-8003");
        for (ServiceInstance element : srvList) {
            System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"
                    + element.getUri());
        }
        return this.client;
    }

}
