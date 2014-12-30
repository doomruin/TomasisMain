package com.tomasis.common;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.struts2.ServletActionContext;


import com.opensymphony.xwork2.ActionSupport;
/**
 *本类封装了三种向前台输出json数据的方法，下面按优先级排列
 * 1、逻辑成功，使用jsonOutput(Object object)输出数据
 * 2、逻辑失败，使用outputFail(String output, int statusCode)输出错误信息
 * 3、基本封装：首先在成功执行后 setResult(Object data)将数据封装，然后 return json（mapResult）.
 *            这种方法适用与封装与输出需要分离的地方。
 *
 */
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

    public String output(String s){
        try {
            HttpServletResponse response = ServletActionContext.getResponse();
            response.setContentType("text/json;charset=UTF8");
            response.getWriter().print(s);
        } catch (Exception e) {
            //logger.error("write json object error", e);
            System.out.println("write json object error!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }
        return null;
    }
    public final String output(Object object) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String jsonString = objectMapper.writeValueAsString(object);
            HttpServletResponse response = ServletActionContext.getResponse();
            response.setContentType("text/json;charset=UTF8");
            response.getWriter().print(jsonString);
        } catch (Exception e) {
            //logger.error("write json object error", e);
            System.out.println("write json object error!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }
        return null;
    }
    //对出现异常信息时的输出代码封装，返回错误信息，

    protected String outputFail(String output, int statusCode){
        try{
            HttpServletResponse response = ServletActionContext.getResponse();
            response.setStatus(statusCode);
            response.setContentType("text/json;charset=UTF8");
            response.getWriter().print(output);
        }catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }
}
