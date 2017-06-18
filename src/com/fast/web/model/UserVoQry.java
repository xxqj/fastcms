/**
 * 
 */
package com.fast.web.model;

/**  
 * @Title: UserVoQry.java
 * @Package com.fast.web.model
 * @Description: TODO
 * @author 喧嚣求静
 * @date 2016-3-27
 * blog:913.iteye.com
 */
public class UserVoQry extends UserVo {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3295898281770280539L;
	
	private String qryUserName;
	
	private String qryPwd;

	public String getQryUserName() {
		return qryUserName;
	}

	public void setQryUserName(String qryUserName) {
		this.qryUserName = qryUserName;
	}

	public String getQryPwd() {
		return qryPwd;
	}

	public void setQryPwd(String qryPwd) {
		this.qryPwd = qryPwd;
	}
	
	

}
