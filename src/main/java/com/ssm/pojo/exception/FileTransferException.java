package com.ssm.pojo.exception;

public class FileTransferException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 677861392425044394L;

	public FileTransferException() {
		super();
	}

	public FileTransferException(String message, Throwable cause) {
		super(message, cause);
	}

	public FileTransferException(String message) {
		super(message);
	}

	public FileTransferException(Throwable cause) {
		super(cause);
	}

}
