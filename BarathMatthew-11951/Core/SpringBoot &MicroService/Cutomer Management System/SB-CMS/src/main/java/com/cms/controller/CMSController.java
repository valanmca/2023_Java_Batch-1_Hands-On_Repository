package com.cms.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cms.bean.Customer;
import com.cms.dao.CustomerDAO;



@RestController
@CrossOrigin("http://localhost:4200/")
public class CMSController {

	@Autowired
	CustomerDAO dao;
	
	@PostMapping("/PerformInsert")
	public void performInsert(@RequestBody Customer cus) {
		dao.save(cus);
	}
	
	@PutMapping("/PerformUpdate")
    public void performUpdate(@RequestBody Customer cus)
    {
        dao.save(cus);
    }
    @DeleteMapping("/PerformDelete/{cId}")
    public void performDelete(@PathVariable("cId") int cId) {
        dao.deleteById(cId);
    }
    
    @GetMapping("/ViewAll")
    public List<Customer> viewAllCustomer(){
        Iterator<Customer> it=dao.findAll().iterator();
         List<Customer> list = new ArrayList<Customer>();
            while (it.hasNext()) {
                list.add(it.next());
            }
            return list;
    }
}
