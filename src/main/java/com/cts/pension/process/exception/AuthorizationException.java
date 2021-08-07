package com.cts.pension.process.exception;

/**
 * @author vivek
 * defining the exception message when the authorization fails
 */
@SuppressWarnings("serial")
public class AuthorizationException extends Exception{

	public AuthorizationException(String message) {
		super(message);
	}
}
