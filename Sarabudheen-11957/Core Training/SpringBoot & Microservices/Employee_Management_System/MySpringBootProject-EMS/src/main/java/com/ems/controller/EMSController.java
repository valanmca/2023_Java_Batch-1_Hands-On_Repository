package com.ems.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
public class EMSController {

	@Autowired
	EmployeeDAO dao;

	/*@RequestMapping("/Start")
	public ModelAndView loadStartingPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("StartingPage");
		return mv;
	}

	@RequestMapping("/Links")
	public ModelAndView loadLinksPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Links");
		return mv;
	}*/

	/*@RequestMapping("/InsertEmployee")
	public ModelAndView loadInsertEmployeePage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("InsertEmployee");
		return mv;
	}*/

	@PostMapping("/PerformInsert")
	public void performInsertEmployee(@RequestBody Employee emp) {
		dao.save(emp);
	}

	/*@RequestMapping("/UpdateEmployee")
	public ModelAndView loadUpdateEmployeePage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("UpdateEmployee");
		return mv;
	}*/

	/*@RequestMapping("/PerformUpdate")
	public ModelAndView performUpdateEmployee(Employee emp) {
		ModelAndView mv = new ModelAndView();
		dao.save(emp);
		mv.setViewName("UpdateEmployeeSuccess");
		mv.addObject("bean", emp);
		return mv;
	}*/
	
	@PutMapping("/PerformUpdate")
	public void performUpdateEmployee(@RequestBody Employee emp) {
		dao.save(emp);
	}

	/*@RequestMapping("/DeleteEmployee")
	public ModelAndView loadDeleteEmployeePage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("DeleteEmployee");
		return mv;
	}*/

	/*@RequestMapping("/PerformDelete")
	public ModelAndView performDeleteEmployee(Employee emp) {
		ModelAndView mv = new ModelAndView();
		dao.delete(emp);
		mv.setViewName("DeleteEmployeeSuccess");
		return mv;
	}*/
	
	@DeleteMapping("/PerformDelete/{id}")
	public void performDeleteEmployee(@PathVariable("id") int id) {
		dao.deleteById(id);
	}

	/*@RequestMapping("/FindEmployee")
	public ModelAndView loadFindEmployeePage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("FindEmployee");
		return mv;
	}

	@RequestMapping("/PerformFind")
	public ModelAndView performFindEmployee(int id) {
		ModelAndView mv = new ModelAndView();
		Employee emp = dao.findById(id).get();
		mv.setViewName("FindEmployeeSuccess");
		mv.addObject("emp", emp);
		return mv;
	}

	@RequestMapping("/FindAllEmployee")
	public ModelAndView performFindAllEmployee() {

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
	public ModelAndView loadFindEmployeeByNamePage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("FindEmployeeByName");
		return mv;
	}

	@RequestMapping("/PerformFindByName")
	public ModelAndView performFindEmployeeByName(String name) {
		ModelAndView mv = new ModelAndView();
		Employee emp = dao.findByName(name);
		mv.setViewName("FindEmployeeByNameSuccess");
		mv.addObject("emp", emp);
		return mv;
	}*/
	
	@GetMapping("/ViewAll")
	public List<Employee> getAllEmployee() {
		System.out.println("Inside View All");
		Iterator<Employee> it =  dao.findAll().iterator();
		List<Employee> list = new ArrayList<Employee>();
		
		while(it.hasNext()) {
			list.add(it.next());
		}
		
		return list;
	}

}
