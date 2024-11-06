package com.braggbnb112.dao;

import java.util.List;

import com.braggbnb112.dao.GenericDAO;
import com.braggbnb112.domain.Booking;





public interface BookingDAO extends GenericDAO<Booking, Integer> {
  
	List<Booking> findAll();
	






}


