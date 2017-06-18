package com.fast.app.model;

import java.io.Serializable;

import com.fast.app.bzcode.JsonResultStatusCode;

/**
 * 用来返回json数据的封装对
 * @author 喧嚣求静
 * blog:http://913.iteye.com
 * 
 * */
public class ResutlsJsonWrap implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9054370920869476388L;
	
	/**
	 * 状态标识flag=0为成功，1=接口失败之类...
	 * */
	private int flag=JsonResultStatusCode.CODE_0;
	
	/**
	 * 返回数据描述
	 * 
	 * */
	private String msg="调用成功";
	
	/**返回数据对象*/
	private Object data="{}";

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	

}
