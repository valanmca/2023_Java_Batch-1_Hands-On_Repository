package com.cus.dao;

import org.springframework.data.repository.CrudRepository;

import com.cus.bean.Customer;

	public interface CustomerDAO extends CrudRepository<Customer, Integer> {
	}


