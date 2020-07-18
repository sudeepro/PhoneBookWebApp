package com.sudeep.exception;

public class NoContactFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3043237947528014637L;

	public NoContactFoundException() {
		super();
	}

	public NoContactFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public NoContactFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public NoContactFoundException(String message) {
		super(message);
	}

	public NoContactFoundException(Throwable cause) {
		super(cause);
	}

}
