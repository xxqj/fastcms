package com.fast.common.dao;

import java.util.List;

import com.fast.common.exception.DaoException;
import com.fast.common.model.Resource;

public interface IResourceDao extends IBaseDao<Resource>{
	
	List<Resource> getParentNode(String pid)throws DaoException;
}
