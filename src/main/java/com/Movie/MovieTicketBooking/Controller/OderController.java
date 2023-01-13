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

import com.Movie.MovieTicketBooking.Entity.Oder;
import com.Movie.MovieTicketBooking.Exception.ResourceNotFoundException;
import com.Movie.MovieTicketBooking.Service.OderService;


@RestController
public class OderController {

	@Autowired
	private OderService oders;
	//order add method(creating)
    @PostMapping(value = "/order/add")
    public ResponseEntity<?> addNewOrder(@RequestBody Oder or) 
    {
 
    	try
    	{
         String message=this.oders.addNewOrder(or);
    	 Map<String, Object> map = new HashMap<String, Object>();
    	 map.put("httpStatus", HttpStatus.CREATED.toString());
         map.put("message", "Order added  Successfully !");
        return new ResponseEntity<>(map,HttpStatus.CREATED);
    	}
    	catch(Exception ex)
    	{
    		Map<String, Object> map = new HashMap<String, Object>();
    		map.clear();
    		map.put("httpStatus", HttpStatus.METHOD_FAILURE);
            map.put("message", ex.getMessage());
            return new ResponseEntity<>(map,HttpStatus.METHOD_FAILURE);
    	}
    }
     
    
    //get method(getAll)
@GetMapping(value = "/order/getAll")
    
    public ResponseEntity<?> getAllOrders() {
    	
    	List<Oder> list=null;
    	list=this.oders.getAllOders();
    	Map<String, Object> map = new HashMap<String, Object>();
    	map.put("httpStatus", HttpStatus.NOT_FOUND);
    	map.put("message","No Order Available");
        
    	if(list.size()==0)
    	{
    		return new ResponseEntity<>(map,HttpStatus.NOT_FOUND);
    	}
    	else
    	{

        	Map<String, Object> map1 = new HashMap<String, Object>();
        	 map1.put("httpStatus", HttpStatus.FOUND.toString());
             map1.put("message", " Fetched All Orders !");
             map1.put("content",list);
           
    		return new ResponseEntity<>(map1,HttpStatus.FOUND);
    	}
    }
    
//Order GetById
@GetMapping(value="/order/getById")
public ResponseEntity<?> getOrderById(@RequestBody Integer id) 
{
	//int cityId=city.getCityId();
	    
	
      Optional<Oder> oder1= this.oders.getOderById(id);
      if(oder1.isPresent()==true)
      {
      Map<String, Object> map1 = new HashMap<String, Object>();
      map1.put("httpStatus", HttpStatus.FOUND.toString());
      map1.put("message", " Fetched Order By OrderId !");
      map1.put("content",oder1);
		return new ResponseEntity<>(map1,HttpStatus.FOUND);
	
      }
      else
      {
  	 throw new ResourceNotFoundException("order","Id",id);
      }
}
      //update method(updating)
      @PutMapping(value = "/order/update")
      public ResponseEntity<?> updateCity(@RequestBody Oder or) {
      		Map<String, Object> map = new HashMap<String, Object>();
      		boolean message=this.oders.updateOder(or);
      		map.put("httpStatus", HttpStatus.OK.toString());
              map.put("message", "Order Updated Successfully !");
          return new ResponseEntity<>(map,HttpStatus.OK);
      	
          
      }
      
    //delete method(deleting)
      @DeleteMapping(value = "/Order/delete")
      public ResponseEntity<?> removeCityById(@RequestBody Integer id) {
      		 //int cityId=city.getCityId();
      		 Map<String, Object> map = new HashMap<String, Object>();
      		 String message=this.oders.removeOder(id);
      		 map.put("httpStatus", HttpStatus.OK);
      	     map.put("message", "Order Deleted Successfully !");
              
      	     return  new ResponseEntity<>(map,HttpStatus.OK);
      	
      		
      		
      }
      
      
} 
	

