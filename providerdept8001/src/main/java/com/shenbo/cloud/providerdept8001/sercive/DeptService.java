package com.shenbo.cloud.providerdept8001.sercive;

import com.shenbo.clould.entities.Dept;

import java.util.List;


public interface DeptService {

    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();


}
