package com.fast.common.model;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.fast.common.dao.Identifiable;



/**  
 * @Title: User.java
 * @Package com.fast.common.model
 * @Description: 系统用户表 T_USER
 * @author 喧嚣求静
 * @date 2016-3-27
 * blog:913.iteye.com
 */
public class User implements Identifiable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7960640546691445926L;

	/**对应表字段:user_id*/
	protected String userId;
	
	/**对应表字段:user_name*/
	protected String userName;
	
	/**对应表字段:pwd*/
	protected String pwd;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		//return "User [pwd=" + pwd + ", userId=" + userId + ", userName="
			//	+ userName + "]";
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}

	/* (non-Javadoc)
	 * @see com.fast.common.dao.Identifiable#getId()
	 */
	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return this.userId;
	}

	/* (non-Javadoc)
	 * @see com.fast.common.dao.Identifiable#setId(java.lang.String)
	 */
	@Override
	public void setId(String id) {
		// TODO Auto-generated method stub
		this.userId=id;
	}
	
	
	
	
}
