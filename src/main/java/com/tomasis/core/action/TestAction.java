package com.tomasis.core.action;


import javax.annotation.Resource;

import com.tomasis.core.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.tomasis.common.BaseAction;




public class TestAction extends BaseAction{
	
	@Autowired
	private TestService testService;



	public String test(){
        testService.say();
		return output("hello ! you succeed");
	}
	
}
