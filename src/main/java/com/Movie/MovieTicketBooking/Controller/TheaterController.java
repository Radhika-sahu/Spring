package com.Movie.MovieTicketBooking.Controller;

import java.util.HashMap;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Movie.MovieTicketBooking.Entity.Theater;
import com.Movie.MovieTicketBooking.Exception.ResourceNotFoundException;
import com.Movie.MovieTicketBooking.Service.TheaterService;


@RestController
class TheaterController {
	@Autowired
private TheaterService thserv;
	
	
//	 @PostMapping(value = "/Thearter/add")
//	    public ResponseEntity<?> addnewTheater(@RequestBody Theater th) 
//	    {
//	       String  message=this.thserv.addNewTheater(th);
//	       Map<String, Object> map = new HashMap<String, Object>();
//	    	 map.put("httpStatus", HttpStatus.CREATED.toString());
//	         map.put("message", "Theater Cretead Successfully !");
//	        return new ResponseEntity<>(map,HttpStatus.CREATED);
//	    }
//	 
//	 @PutMapping(value="/Theater/update")
//	 public ResponseEntity<?> updateTheater(@RequestBody Theater th)
//	 {    
//		 this.thserv.updateTheaater(th);
//		 Map<String, Object> map = new HashMap<String, Object>();
//    	 map.put("httpStatus", HttpStatus.CREATED.toString());
//         map.put("message", "Theater updated Successfully !");
//        return new ResponseEntity<>(map,HttpStatus.CREATED);
//	 }
//	 
//	 @GetMapping(value="/Theater/getAll")
//	 public ResponseEntity<?> getAllTheater()
//	 {
//	     List<Theater>list=null;
//	    list =this.thserv.getAllTheater();
//	    	Map<String, Object> map = new HashMap<String, Object>();
//	    	map.put("httpStatus", HttpStatus.NOT_FOUND);
//	    	map.put("message","No Theater Available");
//	        
//	    	if(list.size()==0)
//	    	{
//	    		return new ResponseEntity<>(map,HttpStatus.NOT_FOUND);
//	    	}
//	    	else
//	    	{
//
//	        	Map<String, Object> map1 = new HashMap<String, Object>();
//	        	 map1.put("httpStatus", HttpStatus.FOUND.toString());
//	             map1.put("message", " Fetched All Theaters with Movie !");
//	             map1.put("content",list);
//	           
//	    		return new ResponseEntity<>(map1,HttpStatus.FOUND);
//	    	}
//	     
//	 }
//	 
//	 //Theater by Id
//	 @GetMapping(value="/Theater/getById")
//	 public ResponseEntity<?> getTheaterByid(@RequestBody Integer id )
//	 {
//		 //int th=th.getTheaterName();
//		// List<Theater> list=null;
//		 Optional<Theater> th1=this.thserv.getByname(id);
//		 if(th1.isPresent()==true)
//	        {
//	        Map<String, Object> map1 = new HashMap<String, Object>();
//	        map1.put("httpStatus", HttpStatus.FOUND.toString());
//	        map1.put("message", " Fetched Theater By Theater Id !");
//	        map1.put("content",th1);
//			return new ResponseEntity<>(map1,HttpStatus.FOUND);
//		
//	        }
//	        else
//	        {
//	    	 throw new ResourceNotFoundException("Theater","Id",id);
//	        }
//	 }
//	 // Delete Theater by id
//       @DeleteMapping(value="/Theater/delete")
//	 public ResponseEntity<?> deleteById(@RequestBody Integer id)
//	 {
//    	   this.thserv.deleteById(id);
//    	   Map<String, Object> map = new HashMap<String, Object>();
//      	 map.put("httpStatus", HttpStatus.OK.toString());
//           map.put("message", "Theater Deleted  Successfully !");
//          return new ResponseEntity<>(map,HttpStatus.OK);
//	 }
//	 

}
