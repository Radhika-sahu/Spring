package com.Movie.MovieTicketBooking.Service;

import java.util.List;
import java.util.Optional;

import javax.persistence.criteria.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Movie.MovieTicketBooking.Dao.OderDao;
import com.Movie.MovieTicketBooking.Entity.Oder;
import com.Movie.MovieTicketBooking.Exception.ResourceNotFoundException;

@Service
public class OderService {
     @Autowired
	private OderDao oderdao;
     
	public String addNewOrder(Oder or) {
		// TODO Auto-generated method stub
		this.oderdao.save(or);
		return null;
	}

	public List<Oder> getAllOders() {
		// TODO Auto-generated method stub
		return oderdao.findAll();
	}

	public Optional<Oder> getOderById(Integer id) {
		// TODO Auto-generated method stub
		return oderdao.findById(id);
	}

	public boolean updateOder(Oder or) {
		// TODO Auto-generated method stub
		if (oderdao.findById(or.getOderId()).isPresent()) {
            oderdao.save(or);
            return true;
        }
        else
        {
        // Doesn't exist, Cannot update
        throw new ResourceNotFoundException("Order","Id",or.getOderId());
    }
}

	public String removeOder(Integer id) {
		// TODO Auto-generated method stub
		if(oderdao.findById(id).isPresent())
        {
        
            oderdao.deleteById(id);
            return "Office Deleted SuccessFully !" ;
        }
        else {
    
        // Doesn't exist, Cannot delete
         throw new ResourceNotFoundException("order","Id",id);
    }
    }
	
	}
