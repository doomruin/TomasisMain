package com.tomasis.core.action;


import javax.annotation.Resource;

import com.tomasis.core.service.TestService;
import org.springframework.stereotype.Controller;

import com.tomasis.common.BaseAction;




public class TestAction extends BaseAction{
	
	
	private TestService testService;

	@Resource
	public void setTestService(TestService testService) {
		this.testService = testService;
	}


	public String test(){
		return output("hello ! you succeed");
	}
	
}
