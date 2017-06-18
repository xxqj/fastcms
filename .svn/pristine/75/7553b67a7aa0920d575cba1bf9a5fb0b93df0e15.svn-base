package com.fast.app.exception;


/**
 * 
 * @author 喧嚣求静
 * 
 * blog:http://913.iteye.com
 *
 * */
public class AppExcetion extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8384800471314873635L;
	
	private int errorCode;
	
	private String errorMsg;

	public AppExcetion(int errorCode, String errorMsg,Throwable cause) {
		super(cause);
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}
	public AppExcetion(int errorCode, String errorMsg) {
		super();
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}
	
	public AppExcetion() {
		super();
		// TODO Auto-generated constructor stub
	}


	public AppExcetion(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}


	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	
	

}
