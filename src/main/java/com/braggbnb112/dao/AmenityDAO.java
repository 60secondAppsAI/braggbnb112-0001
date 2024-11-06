package com.braggbnb112.dao;

import java.util.List;

import com.braggbnb112.dao.GenericDAO;
import com.braggbnb112.domain.Amenity;





public interface AmenityDAO extends GenericDAO<Amenity, Integer> {
  
	List<Amenity> findAll();
	






}


