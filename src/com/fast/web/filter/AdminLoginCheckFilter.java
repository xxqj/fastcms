package com.fast.web.filter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import com.fast.common.constants.CommonConstant;



/**
 * 用户验证Filter，检验用户是否处于登陆状态
 * 
 */
public class AdminLoginCheckFilter implements Filter {
	
    private static Logger logger = Logger.getLogger(AdminLoginCheckFilter.class);

    public void init(FilterConfig config) {

    }

    /**
     * 权限验证
     */
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) 
                  throws java.io.IOException, javax.servlet.ServletException 
    {
        
    	 HttpServletRequest req = (HttpServletRequest) request;  
    	 HttpServletResponse res = (HttpServletResponse) response;
        //基于http协议的servlet 
      
        //如果没有登录.  
        String requestURI = req.getRequestURI().substring(req.getRequestURI().indexOf("/",1),req.getRequestURI().length());  
         logger.debug("--------------------"+requestURI);
        //如果第一次请求不为登录页面,则进行检查用session内容,如果为登录页面就不去检查.  
        if(!requestURI.contains("/login.jsp"))  
        {  
            //取得session. 如果没有session则自动会创建一个, 我们用false表示没有取得到session则设置为session为空.  
            HttpSession session = req.getSession(false);  
            //如果session中没有任何东西.  
            if(session == null ||session.getAttribute(CommonConstant.ADMIN_SESSION_USER)==null)  
            {  
            	res.sendRedirect(req.getContextPath() + "/views/admin/login.jsp");
                //返回  
                return;  
            }  
              
        }  
          //session中的内容等于登录页面, 则可以继续访问其他区资源.  
          filterChain.doFilter(req, res);  
       
    }

    /**
     * 
     * (方法说明描述) 销毁过滤器
     * 
     */
    public void destroy() {

    }

}
