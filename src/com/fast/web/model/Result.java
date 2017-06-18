/**
 * 
 */
package com.fast.web.model;

/**  
 * @Title: Result.java
 * @Package com.fast.web.model
 * @Description: Ajax处理结果对象
 * @author 喧嚣求静
 * @date 2016-3-26
 * blog:913.iteye.com
 */
 public class Result {
	 
	/**
	 * @fields serialVersionUID 
	 */
	private static final long serialVersionUID = 5905715228490291386L;
	
	/**
	 * @fields status  状态信息，正确返回OK，否则返回 ERROR，如果返回ERROR则需要填写Message信息
	 */
	private Status status;
	
	/**
	 * @fields record 消息对象
	 */
	private Object message;
	
	private Object data;

	public Result() {
		super();
	}

	/**
	 * @description 
	 * @param status 状态
	 * @param message 消息
	 */
	public Result(Status status, Object message) {
		this.status = status;
		this.message = message;
	}

	/**
	 * 结果类型信息
	 * 
	 */
	public enum Status {
		OK, ERROR
	}

	/**
	 * 添加成功结果信息
	 * @param record
	 */
	public void addOK(Object message) {
		this.message = message;
		this.status = Status.OK;
	}

	/**
	 * 添加错误消息
	 * @param message
	 */
	public void addError(Object message) {
		this.message = message;
		this.status = Status.ERROR;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Object getMessage() {
		return message;
	}

	public void setMessage(Object message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	

}

