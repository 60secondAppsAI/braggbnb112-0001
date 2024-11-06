package com.braggbnb112.dao;

import java.util.List;

import com.braggbnb112.dao.GenericDAO;
import com.braggbnb112.domain.User;

import java.util.Optional;




public interface UserDAO extends GenericDAO<User, Integer> {
  
	List<User> findAll();
	






}


