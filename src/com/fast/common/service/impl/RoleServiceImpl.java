package com.fast.common.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fast.common.dao.IBaseDao;
import com.fast.common.dao.IRoleDao;
import com.fast.common.model.Role;
import com.fast.common.service.IRoleService;



@Service
public class RoleServiceImpl extends BaseServiceImpl<Role> implements IRoleService{

	@Autowired
	private IRoleDao roleDao;
	
	
	
	@Override
	protected IBaseDao<Role> getBaseDao() {
		// TODO Auto-generated method stub
		return roleDao;
	}

}
