package com.gizemtuncer.exception;

public class NotFoundException extends RuntimeException{

	private static final long serialVersionUID = 11005327785098297L;

	public NotFoundException(String message){
		super(message);
	}
}
