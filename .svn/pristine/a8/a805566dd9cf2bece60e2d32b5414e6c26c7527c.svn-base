/**
 * 
 */
package com.fast.web.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fast.common.model.User;
import com.fast.common.service.IBaseService;
import com.fast.common.service.IUserService;
import com.fast.web.controller.impl.BaseCurdControllerImpl;
import com.fast.web.model.UserVo;
import com.fast.web.model.UserVoQry;

/**  
 * @Title: DemoController.java
 * @Package com.fast.web.demo
 * @Description: TODO
 * @author 喧嚣求静
 * @date 2016-3-26
 * blog:913.iteye.com
 */
@Controller
@RequestMapping("/web")
public class DemoController extends BaseCurdControllerImpl<User, UserVoQry> {
	
	@Autowired
	private IUserService userService;

	@Override
	protected IBaseService<User> getBaseService() {
		return userService;
	}

}