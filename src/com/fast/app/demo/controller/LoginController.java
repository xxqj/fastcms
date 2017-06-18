package com.fast.app.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fast.app.bzcode.JsonResultStatusCode;
import com.fast.app.model.ResutlsJsonWrap;
import com.fast.common.model.User;
import com.fast.common.service.IUserService;


/**
 * 
 *  @author 喧嚣求静
 * 
 * blog:http://913.iteye.com
 * 
 * */

@Controller
@RequestMapping(value = "/app")
public class LoginController {

	private static final  Logger logger = Logger.getLogger(LoginController.class.getName());
	
	@Autowired
	private IUserService userService;


	public LoginController() {
		super();
		// TODO Auto-generated constructor stub
	}



	@RequestMapping(value = "/login.do")
	@ResponseBody
	public ResutlsJsonWrap checkLogin(HttpServletRequest request,
			HttpServletResponse response, HttpSession session) {
		
		String loginName = request.getParameter("loginName");
		String loginPsw = request.getParameter("loginPsw");
		logger.info("loginName="+loginName+"\t loginPsw="+loginPsw);
		
		
		ResutlsJsonWrap resultJson=new ResutlsJsonWrap();
		
		try{
			
			  User user=userService.checkLogin(loginName, loginPsw);
			  resultJson.setData(user);
			  resultJson.setFlag(JsonResultStatusCode.CODE_0);
			  resultJson.setMsg("登录成功");
			  
		    }catch(Exception e){
			  resultJson.setFlag(JsonResultStatusCode.CODE_4);
			  resultJson.setMsg(e.getMessage());
		    }
		
		
		return resultJson;
	}

	

}
