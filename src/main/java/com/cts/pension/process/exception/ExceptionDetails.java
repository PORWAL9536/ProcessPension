package com.cts.pension.process.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;

/**
 * @author vivek
 * defining the exception message to display the exception details
 */
@Getter
public class ExceptionDetails {
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
	private LocalDateTime timeStamp;
	private HttpStatus status;
	private String message;
	
	public ExceptionDetails(LocalDateTime timeStamp, HttpStatus status, String message) {
		super();
		this.timeStamp = timeStamp;
		this.status = status;
		this.message = message;
	}
}
