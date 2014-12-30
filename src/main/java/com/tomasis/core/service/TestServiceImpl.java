package com.tomasis.core.service;
import com.tomasis.core.model.TestInfo;
import com.tomasis.infrastructure.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("testService")
public class TestServiceImpl implements TestService{

    @Autowired
    private TestDao dao;
    public void say() {

        System.out.println("!!!!!!!!!!!!!!!!!OK!!!!!!!!!!!!!!!!!!!!!");
        TestInfo test = dao.findById(1);
        System.out.println(test.getName());
    }
}
