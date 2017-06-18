/**
 * 
 */
package com.fast.common.dao.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

import com.fast.common.dao.IUserDao;
import com.fast.common.exception.DaoException;
import com.fast.common.model.User;



/**  
 * @Title: UserDaoImpl.java
 * @Package com.fast.common.dao.impl
 * @Description: TODO
 * @author 喧嚣求静
 * @date 2016-3-27
 * blog:913.iteye.com
 */

@Repository
public class UserDaoImpl extends BaseDaoImpl<User> implements IUserDao {

	/* (non-Javadoc)
	 * @see com.fast.common.dao.IUserDao#checkLogin(java.lang.String, java.lang.String)
	 */
	@Override
	public User checkLogin(String userName, String psw) throws DaoException {
		Assert.notNull(userName);
		Assert.notNull(psw);
		try {
			Map<String, Object> params = new HashMap<String,Object>();
			params.put("name", userName);
			params.put("pwd", psw);
			return sqlSessionTemplate.selectOne(getSqlName("loginValid"), params);
		} catch (Exception e) {
			throw new DaoException(String.format("查询一条记录出错！语句：%s", getSqlName("loginValid")), e);
		}
	}
	
}
