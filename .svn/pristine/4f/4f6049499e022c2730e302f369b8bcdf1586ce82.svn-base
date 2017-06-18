package com.fast.web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.fast.common.constants.CommonConstant;
import com.fast.common.model.User;

public class CheckLoginInterCeptor implements HandlerInterceptor {
	
	private static final Logger logger = Logger.getLogger(CheckLoginInterCeptor.class.getName());

	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		
		logger.debug("prehandle");

	}

	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub
		
		logger.debug("prehandle");
	}

	public boolean preHandle(HttpServletRequest request, HttpServletResponse res,
			Object arg2) throws Exception {
		
		logger.debug("prehandle");
		
           User userInfo = (User) request.getSession().getAttribute(CommonConstant.SESSION_USER);
     
            if (null != userInfo && null != userInfo.getUserName()) {
            	 //用户已经登录
	            return true;
            } else {
                //用户没有登录
                res.sendRedirect(request.getContextPath() + "/views/admin/login.jsp");
                return false;
            }
		

	}

}
