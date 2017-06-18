package com.fast.common.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fast.common.dao.IBaseDao;
import com.fast.common.dao.IResourceDao;
import com.fast.common.exception.ServiceException;
import com.fast.common.model.Resource;
import com.fast.common.service.IResourceService;



@Service
public class ResourceServiceImpl extends BaseServiceImpl<Resource> implements IResourceService{

	@Autowired
	private IResourceDao resourceDao;
	
	
	
	@Override
	protected IBaseDao<Resource> getBaseDao() {
		
		return resourceDao;
	}



	public List<Resource> getParentNode(String pid) throws ServiceException {
		
		try {
			
			  return resourceDao.getParentNode(pid);
			
		   } catch (Exception e) {
			  throw new ServiceException(String.format("查询一条记录出错！语句：%s", e.getMessage(), e));
		   }
	}

}
