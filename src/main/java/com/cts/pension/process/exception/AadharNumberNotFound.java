package com.cts.pension.process.exception;


/**
 * @author vivek
 * defining the exception message when the aadhar number is not found
 */
public class AadharNumberNotFound extends Exception{

	
	private static final long serialVersionUID = 1L;

	public AadharNumberNotFound(String message)
	{
		super(message);
	}
}
