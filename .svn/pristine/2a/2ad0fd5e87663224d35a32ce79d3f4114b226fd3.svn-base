package com.fast.common.model;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import com.fast.common.dao.Identifiable;



/**  
 * @Title: Role.java
 * @Package com.fast.common.Role
 * @Description: 系统角色表 T_ROLE
 * @author 喧嚣求静
 * @date 2016-3-27
 * blog:913.iteye.com
 */
public class Role implements Identifiable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2689522385772424026L;


	/**对应表字段:rid*/
	protected String rid;
	
	/**对应表字段:rname*/
	protected String rname;
	
	/**对应表字段:remark*/
	protected String remark;


	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRId() {
		return rid;
	}

	public void setRId(String id) {
		rid = id;
	}

	public String getRName() {
		return rname;
	}

	public void setRName(String name) {
		rname = name;
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
		return this.rid;
	}

	/* (non-Javadoc)
	 * @see com.fast.common.dao.Identifiable#setId(java.lang.String)
	 */
	@Override
	public void setId(String id) {
		// TODO Auto-generated method stub
		this.rid=id;
	}
	
	
	
	
}
