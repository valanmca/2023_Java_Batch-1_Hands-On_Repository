package com.ems.controller;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ems.bean.Employee;
import com.ems.dao.EmployeeDAO;

@RestController
public class EMSController {
	@Autowired
	EmployeeDAO dao;

	@RequestMapping("/Start")
	public ModelAndView loadLandingPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("LandingPage");
		return mv;
	}

	@RequestMapping("/Links")
	public ModelAndView loadLinksPage() {
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
	public ModelAndView performInsert(Employee emp) {
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
	public ModelAndView loadDeleteEmployeePage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("DeleteEmployee");
		return mv;
	}

	@RequestMapping("/PerformDelete")
	public ModelAndView performDelete(Employee emp) {
		ModelAndView mv = new ModelAndView();
		dao.delete(emp);
		mv.setViewName("DeleteEmployeeSuccess");
		mv.addObject("bean", emp);
		return mv;
	}

	@RequestMapping("/FindEmployee")
	public ModelAndView loadFindEmployeePage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("FindEmployee");
		return mv;
	}

	@RequestMapping("/PerformFind")
	public ModelAndView performFind(int eid) {
		ModelAndView mv = new ModelAndView();
		Employee emp = dao.findById(eid).get();
		mv.setViewName("FindEmployeeSuccess");
		mv.addObject("bean", emp);
		return mv;
	}

	@RequestMapping("FindAllEmployeeSuccess")
	public ModelAndView loadFindAllEmployeePage() {
		Iterator<Employee> it = dao.findAll().iterator();

		String temp = "";
		while (it.hasNext()) {
			Employee e = it.next();
			temp += "<tr><td>" + e.getEid() + "</td><td>" + e.getEname() + "</td><td>" + e.getEsalary() + "</td></tr>";
		}
		ModelAndView mv = new ModelAndView();
		mv.addObject("temp", temp);
		mv.setViewName("FindAllEmployeeSuccess");
		return mv;
	}
}
