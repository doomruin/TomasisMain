package com.test.api;


import com.tomasis.core.model.TestInfo;
import com.tomasis.infrastructure.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

public class TestInfoTest extends BaseTest{
    @Autowired
    private TestDao testDao;

	public  void test(){
        TestInfo test = testDao.findById(1);
        System.out.println(test.getName());
    }
	
}
