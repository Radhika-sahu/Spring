package com.Movie.MovieTicketBooking.Exception;

public class APIResponse {
	public String  httpStatus;
	public String message;

	public APIResponse(String httpStatus,String message) {
		super();
		this.httpStatus = httpStatus;
		this.message = message;
		
	}
	
	public APIResponse(){
		super();
		this.httpStatus=httpStatus;
		this.message=message;
		
	}	
	
	public String getHttpStatus() {
		return httpStatus;
	}
	public void setHttpStatus(String httpStatus) {
		this.httpStatus = httpStatus;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	
}
