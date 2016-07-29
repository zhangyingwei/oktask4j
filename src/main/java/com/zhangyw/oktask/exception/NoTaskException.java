package com.zhangyw.oktask.exception;

public class NoTaskException extends Exception {

	public NoTaskException() {
		super();
	}

	public NoTaskException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public NoTaskException(String message, Throwable cause) {
		super(message, cause);
	}

	public NoTaskException(String message) {
		super(message);
	}

	public NoTaskException(Throwable cause) {
		super(cause);
	}
	
}
