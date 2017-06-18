package com.fast.common.model;

import com.fast.common.dao.Identifiable;

/**  
 * @Title: RoleResource.java
 * @Package com.fast.common.RoleResource
 * @Description: 系统功能表 T_ROLE_RESOURCE
 * @author 喧嚣求静
 * @date 2016-4-8
 * blog:913.iteye.com
 */
public class RoleResource implements Identifiable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1381296860246260684L;

	/**对应表字段:fid*/
	protected String fid;
	
	/**对应表字段:role_id*/
	protected String roleId;
	
	/**对应表字段:resource_id*/
	protected String resourceId;
	
	
	
	
	public String getId() {
		// TODO Auto-generated method stub
		return fid;
	}

	public void setId(String id) {
		// TODO Auto-generated method stub
        this.fid=id;
	}

	public String getFid() {
		return fid;
	}

	public void setFid(String fid) {
		this.fid = fid;
	}

	public String getResourceId() {
		return resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	
	
	

}
