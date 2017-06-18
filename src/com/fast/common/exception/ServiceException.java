package com.fast.common.exception;

/**  
 * @Title: ServiceException.java
 * @Package com.fast.common.exception
 * @Description: TODO
 * @author 喧嚣求静
 * @date 2016-3-26
 * blog:913.iteye.com
 */

public class ServiceException extends RuntimeException {

	private static final long serialVersionUID = -360277845666981697L;

	public ServiceException() {
		super();
	}

	public ServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	public ServiceException(String message) {
		super(message);
	}

	public ServiceException(Throwable cause) {
		super(cause);
	}

}
