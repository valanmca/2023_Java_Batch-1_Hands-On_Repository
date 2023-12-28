package com.cms.dao;

import org.springframework.data.repository.CrudRepository;

import com.cms.bean.Customer;

public interface CustomerDAO extends CrudRepository<Customer, Integer> {

}
