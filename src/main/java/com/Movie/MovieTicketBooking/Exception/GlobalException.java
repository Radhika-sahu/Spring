package com.Movie.MovieTicketBooking.Exception;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@RestControllerAdvice
public class GlobalException {
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<APIResponse>resourcenotfoundexceptionhandler(ResourceNotFoundException ex)
	{
		String message=ex.getMessage();
		APIResponse apiresponse=new APIResponse(HttpStatus.NOT_FOUND.toString(),message);
	return new ResponseEntity<APIResponse>(apiresponse,HttpStatus.NOT_FOUND);
		
	}
	
}
