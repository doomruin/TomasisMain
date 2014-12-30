package com.test.api.common.action;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

public abstract class BaseAction extends ActionSupport {
	
	private static final long serialVersionUID = 8401098122013995650L;

    //private static final Logger logger = LoggerFactory.getLogger(BaseAction.class);
    protected static final String MSG500 = "服务器打了会盹！";
    protected static final String MSG_NOPERMISSION = "对不起，您无权访问";
    protected static final String MSG_NONE = "结果为空";
    protected static final String SUCCESS = "操作成功";
    protected static final String FAIL = "操作失败";
    protected static final String NO_ACCESS = "对不起，您无权进行此操作";
    protected static final String DATA_ALREADY_EXIST = "数据已存在，请检查后再试";
    protected static final int ERROR_NUM = 500;
    protected static final int NONE_NUM = 525;
    protected Map<String, Object> mapResult = new HashMap<String, Object>();
}
