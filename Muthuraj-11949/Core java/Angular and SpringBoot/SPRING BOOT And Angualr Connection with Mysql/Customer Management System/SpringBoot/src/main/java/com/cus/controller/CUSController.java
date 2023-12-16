package com.cus.controller;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.cus.dao.CustomerDAO;
import com.cus.bean.Customer;

@RestController
@CrossOrigin("http://localhost:4200/")
public class CUSController {
	@Autowired
	CustomerDAO dao;

	@PostMapping("/PerformInsert")
	public void performInsert(@RequestBody Customer cus) {
		dao.save(cus);
	}

	@PutMapping("/PerformUpdate")
	public void performUpdate(@RequestBody Customer cus) {
		dao.save(cus);
	}

	@DeleteMapping("/PerformDelete/{cusID}")
	public void performDelete(@PathVariable("cusID") int id) {
		dao.deleteById(id);
	}

	@GetMapping("/viewAll")
	public List<Customer> getAllCustomer() {
		System.out.println("Inside view All");
		Iterator<Customer> it = dao.findAll().iterator();
		List<Customer> list = new ArrayList<Customer>();
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
}
