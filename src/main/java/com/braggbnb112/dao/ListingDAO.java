package com.braggbnb112.dao;

import java.util.List;

import com.braggbnb112.dao.GenericDAO;
import com.braggbnb112.domain.Listing;





public interface ListingDAO extends GenericDAO<Listing, Integer> {
  
	List<Listing> findAll();
	






}


