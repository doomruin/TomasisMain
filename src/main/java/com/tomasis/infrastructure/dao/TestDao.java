package com.tomasis.infrastructure.dao;

import com.tomasis.core.model.TestInfo;

import java.util.Map;


public interface TestDao {
    public TestInfo findById(int id);
	
}
