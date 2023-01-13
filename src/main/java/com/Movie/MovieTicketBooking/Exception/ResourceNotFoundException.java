package com.Movie.MovieTicketBooking.Exception;

public class ResourceNotFoundException extends RuntimeException {
	String recourseName;
    String fieldName;
    long fieldvalue;
    
	    public ResourceNotFoundException(String recourseName, String fieldName, long fieldvalue) {
		super(String.format("%s Not found with %s:%s",recourseName,fieldName,fieldvalue));
		this.recourseName = recourseName;
		this.fieldName = fieldName;
		this.fieldvalue = fieldvalue;
	}
		
}


