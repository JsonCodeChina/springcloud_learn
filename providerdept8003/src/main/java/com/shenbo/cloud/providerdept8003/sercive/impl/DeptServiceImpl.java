package com.shenbo.cloud.providerdept8003.sercive.impl;




import com.shenbo.cloud.providerdept8003.dao.DeptDao;
import com.shenbo.cloud.providerdept8003.sercive.DeptService;
import com.shenbo.clould.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;


    @Override
    public boolean add(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return deptDao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return deptDao.findAll();
    }
}
