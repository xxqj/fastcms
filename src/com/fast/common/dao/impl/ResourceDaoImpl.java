package com.fast.common.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

import com.fast.common.dao.IResourceDao;
import com.fast.common.exception.DaoException;
import com.fast.common.model.Resource;



@Repository
public class ResourceDaoImpl extends BaseDaoImpl<Resource> implements IResourceDao {
	

	public List<Resource> getParentNode(String pid) throws DaoException {
		
		Assert.notNull(pid);
		
		try {
			
			Map<String, Object> params = new HashMap<String,Object>();
			params.put("pid", pid);
			
			return sqlSessionTemplate.selectList(getSqlName("selectByPid"), params);
		} catch (Exception e) {
			throw new DaoException(String.format("查询一条记录出错！语句：%s", getSqlName("selectByPid")), e);
		}
	}

}
