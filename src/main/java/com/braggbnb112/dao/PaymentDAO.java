package com.braggbnb112.dao;

import java.util.List;

import com.braggbnb112.dao.GenericDAO;
import com.braggbnb112.domain.Payment;





public interface PaymentDAO extends GenericDAO<Payment, Integer> {
  
	List<Payment> findAll();
	






}

