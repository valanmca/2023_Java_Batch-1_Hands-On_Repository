package com.pms.controller;

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

import com.pms.bean.Product;
import com.pms.dao.ProductDAO;

@RestController
@CrossOrigin("http://localhost:4200/")
public class PMSController {
	@Autowired
	ProductDAO dao;
	
	@PostMapping("/PerformInsert")
	public void insert(@RequestBody Product pro)
	{
		dao.save(pro);
	}
	
	
	@PutMapping("/PerformUpdate")
	public void update(@RequestBody Product pro)
	{
		dao.save(pro);
	}
	
	@DeleteMapping("/PerformDelete/{pId}")
	public void update(@PathVariable ("pId") int pId)
	{
		dao.deleteById(pId);
	}
	
	@GetMapping("/ViewAll")
	public  List<Product>  getAllProduct()
	{
		Iterator <Product> it=dao.findAll().iterator();
		ArrayList<Product> list= new ArrayList<Product>();
		
		while(it.hasNext())
		{
			list.add(it.next());
		}
		return list;
		
		
	}
	
	

}
