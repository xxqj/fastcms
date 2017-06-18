/**
 * 
 */
package com.fast.common.dao;

import com.fast.common.exception.DaoException;
import com.fast.common.model.User;

/**  
 * @Title: IUserDao.java
 * @Package com.fast.common.dao
 * @Description: TODO
 * @author 喧嚣求静
 * @date 2016-3-27
 * blog:913.iteye.com
 */
public interface IUserDao extends IBaseDao<User> {
	
	public User checkLogin(String userName,String psw) throws DaoException;

}
