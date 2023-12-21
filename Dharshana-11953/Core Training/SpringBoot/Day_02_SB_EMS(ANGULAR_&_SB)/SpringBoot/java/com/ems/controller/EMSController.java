package com.ems.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ems.bean.Employee;
import com.ems.dao.EmployeeDAO;

@RestController
@CrossOrigin("http://localhost:4200/")
//@Controller
public class EMSController {

	@Autowired
	EmployeeDAO dao;

	
	// Insert the record using Angular And Spring Boot

	@PostMapping("/PerformInsert")
	public void performInsert(@RequestBody Employee emp) {
		dao.save(emp);

	}

	// Update the record using Angular And Spring Boot

	@PutMapping("/PerformUpdate")
	public void performUpdate(@RequestBody Employee emp) {
		dao.save(emp);

	}

	// Delete the record using Angular And Spring Boot

	@DeleteMapping("/PerformDelete/{id}")
	public void performDelete(@PathVariable("id") int id) {
		dao.deleteById(id);

	}

	// Find the record using Angular And Spring Boot

	@GetMapping("/ViewAll")
	public List<Employee> getAllEmployee() {
		System.out.println("Inside ViewAll");
		Iterator<Employee> it = dao.findAll().iterator();
		List<Employee> list = new ArrayList<Employee>();
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}

}
	 
	/*@RequestMapping("/Start")
	public ModelAndView loadLandingPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("LandingPage");
		return mv;
	}

	@RequestMapping("/Links")
	public ModelAndView loadLinkPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Links");
		return mv;
	}

	@RequestMapping("/InsertEmployee")
	public ModelAndView loadInsertEmployeePage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("InsertEmployee");
		return mv;
	}

	@RequestMapping("/PerformInsert")
	public ModelAndView loadPerformInsertEmployee(Employee emp) {
		ModelAndView mv = new ModelAndView();
		dao.save(emp);
		mv.setViewName("InsertEmployeeSuccess");
		mv.addObject("bean", emp);
		return mv;
	}

	@RequestMapping("/UpdateEmployee")
	public ModelAndView loadUpdateEmployeePage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("UpdateEmployee");
		return mv;
	}

	@RequestMapping("/PerformUpdate")
	public ModelAndView performUpdate(Employee emp) {
		ModelAndView mv = new ModelAndView();
		dao.save(emp);
		mv.setViewName("UpdateEmployeeSuccess");
		mv.addObject("bean", emp);
		return mv;
	}

	@RequestMapping("/DeleteEmployee")
	public ModelAndView loadDeleteEmployee() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("DeleteEmployee");
		return mv;
	}

	@RequestMapping("/PerformDelete")
	public ModelAndView loadPerformDeleteSuccess(Employee emp) {
		ModelAndView mv = new ModelAndView();
		dao.delete(emp);
		mv.setViewName("DeleteEmployeeSuccess");
		mv.addObject("bean", emp);
		return mv;
	}

	@RequestMapping("/FindEmployee")
	public ModelAndView loadFindEmployee() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("FindEmployee");
		return mv;
	}

	@RequestMapping("/PerformFind")
	public ModelAndView loadPerformFind(int id) {
		Employee bean = dao.findById(id).get();
		ModelAndView mv = new ModelAndView("FindEmployeeSuccess");
		mv.addObject("bean", bean);
		return mv;
	}

	@RequestMapping("FindAllEmployee")
	public ModelAndView loadFindAllEmployee() {
		Iterator<Employee> it = dao.findAll().iterator();

		String temp = "";
		while (it.hasNext()) {
			Employee e = it.next();
			temp += "<tr><td>" + e.getId() + "</td><td>" + e.getName() + "</td><td>" + e.getSalary() + "</td></tr>";
		}
		ModelAndView mv = new ModelAndView();
		mv.addObject("temp", temp);
		mv.setViewName("FindAllEmployee");
		return mv;
	}

	@RequestMapping("/FindEmployeeByName")
	public ModelAndView loadFindEmployeeByName() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("FindEmployeeByName");
		return mv;
	}

	@RequestMapping("/PerformFindByName")
	public ModelAndView loadPerformFindByName(String name) {
		Employee bean = dao.findByname(name);
		ModelAndView mv = new ModelAndView("FindEmployeeSuccess");
		mv.addObject("bean", bean);
		return mv;
	}
}*/