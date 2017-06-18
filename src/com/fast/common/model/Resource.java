package com.fast.common.model;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import com.fast.common.dao.Identifiable;



/**  
 * @Title: Resource.java
 * @Package com.fast.common.Resource
 * @Description: 系统功能表 T_RESOURCE
 * @author 喧嚣求静
 * @date 2016-3-27
 * blog:913.iteye.com
 */
public class Resource implements Identifiable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1441000351338977412L;
	
	public static String SUPER_PID="0";

	/**对应表字段:fid*/
	protected String fid;
	
	/**对应表字段:function_name*/
	protected String functionName;
	
	/**对应表字段:function_url*/
	protected String functionUrl;
	
	/**对应表字段function_desc*/
	protected String functionDesc;

	/**对应表字段:pid*/
	protected String pid;
	
	protected String postion;

	public String getFid() {
		return fid;
	}

	public void setFid(String fid) {
		this.fid = fid;
	}

	public String getFunctionName() {
		return functionName;
	}

	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	public String getFunctionUrl() {
		return functionUrl;
	}

	public void setFunctionUrl(String functionUrl) {
		this.functionUrl = functionUrl;
	}
	

	public String getFunctionDesc() {
		return functionDesc;
	}

	public void setFunctionDesc(String functionDesc) {
		this.functionDesc = functionDesc;
	}
	

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}
	

	public String getPostion() {
		return postion;
	}

	public void setPostion(String postion) {
		this.postion = postion;
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
		return this.fid;
	}

	/* (non-Javadoc)
	 * @see com.fast.common.dao.Identifiable#setId(java.lang.String)
	 */
	@Override
	public void setId(String id) {
		// TODO Auto-generated method stub
		this.fid=id;
	}
	
	
	
	
}
