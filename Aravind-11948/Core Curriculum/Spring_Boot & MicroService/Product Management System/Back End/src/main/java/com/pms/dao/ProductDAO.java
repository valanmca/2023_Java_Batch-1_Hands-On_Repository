package com.pms.dao;

import org.springframework.data.repository.CrudRepository;

import com.pms.bean.Product;

public interface ProductDAO  extends CrudRepository<Product, Integer>{

}
