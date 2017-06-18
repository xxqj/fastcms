/**
 * 
 */
package com.fast.common.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fast.common.dao.IBaseDao;
import com.fast.common.dao.IUserDao;
import com.fast.common.exception.ServiceException;
import com.fast.common.model.User;
import com.fast.common.service.IUserService;

/**  
 * @Title: UserServiceImpl.java
 * @Package com.fast.common.service.impl
 * @Description: TODO
 * @author 喧嚣求静
 * @date 2016-3-27
 * blog:913.iteye.com
 */

@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements IUserService {
	
	
	@Autowired
	private IUserDao userDao;

	
	
	/* (non-Javadoc)
	 * @see com.fast.common.service.impl.BaseServiceImpl#getBaseDao()
	 */
	@Override
	protected IBaseDao<User> getBaseDao() {
		// TODO Auto-generated method stub
		return userDao;
	}


	/* (non-Javadoc)
	 * @see com.fast.common.service.IUserService#checkLogin(java.lang.String, java.lang.String)
	 */
	@Override
	public User checkLogin(String userName, String psw) throws ServiceException {
		try {
			return userDao.checkLogin(userName, psw);
		} catch (Exception e) {
			throw new ServiceException(String.format("查询一条记录出错！语句：%s", e.getMessage(), e));
		}
		
	}

	

}
