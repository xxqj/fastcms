package com.fast.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fast.common.constants.CommonConstant;
import com.fast.common.exception.ServiceException;
import com.fast.common.model.User;
import com.fast.common.service.IUserService;
import com.fast.common.utils.VerifyImage;
import com.fast.web.model.Result;

/**
 * 
 * @author 喧嚣求静
 * 
 * blog:http://913.iteye.com
 * 
 */

@Controller
public class AdminController {

	private static final Logger logger = Logger.getLogger(AdminController.class.getName());
	
	@Autowired
	private IUserService userService;

	
	
	@RequestMapping(value = "/admin/doLogin.do")
	@ResponseBody
	public Result login(HttpServletRequest request,
			            HttpServletResponse response, HttpSession session) {

		  Result rs=new Result();
		  HttpServletRequest req = (HttpServletRequest) request;
		  
		  String username= req.getParameter("username");
		  String password= req.getParameter("password");
		  String validCode= req.getParameter("validCode");
		  
		  Assert.notNull(username);
		  Assert.notNull(password);
		  Assert.notNull(validCode);

		  String validateCode = (String) request.getSession().getAttribute(CommonConstant.VALID_CODE);
		  if(validateCode==null){
			  rs.addError(CommonConstant.VALID_CODE_FAIL);
		  }else if(!validateCode.equalsIgnoreCase(validCode.trim())){
			  rs.addError(CommonConstant.VALID_CODE_ERROR);
		  }else{
			  
			  try{
				   User u= userService.checkLogin(username, password);
				   if(u!=null){
					   session.setAttribute(CommonConstant.ADMIN_SESSION_USER, u);
					   rs.setData(u);
					   rs.addOK(CommonConstant.LOGIN_OK);
				   }else{
					   rs.addError(CommonConstant.NAME_PSW_INVALID) ;
				   }
				   
			     }catch(ServiceException e){
				   rs.addError(CommonConstant.NAME_PSW_INVALID) ;
		           logger.error(e.getMessage(), e);
		           e.printStackTrace();
			     }
		     
		  }
		  
		  return rs;

	}
	
	/**
     * 用户退出
     * 
     * @return
     * @throws Exception
     */
	@RequestMapping(value = "/admin/logout.do")
	@ResponseBody
    public Result logout(HttpServletRequest request,
			             HttpServletResponse response, HttpSession session) throws Exception {
        
        session.removeAttribute(CommonConstant.ADMIN_SESSION_USER);
        Result rs=new Result();
        rs.addOK(CommonConstant.LOGOUT_OK);
        
        return rs;
    }

    /**
     * 获取验证码
     * @return
     * @throws Exception
     */
	@RequestMapping(value = "/admin/getVerifyCode.do")
    public void getVerifyCode(HttpServletRequest request,
			                  HttpServletResponse response, HttpSession session) throws Exception {
		
    	VerifyImage.createVerifyCodeImg(request, response);
    }

}
