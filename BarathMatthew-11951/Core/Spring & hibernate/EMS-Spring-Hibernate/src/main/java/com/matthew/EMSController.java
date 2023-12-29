package com.matthew;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.matthew.bean.Employee;
import com.matthew.dao.EmployeeDAO;

@Controller
public class EMSController {
	@Autowired
	EmployeeDAO dao;

	@RequestMapping("Links")

	public ModelAndView loadLinks() {
		ModelAndView mv = new ModelAndView("Links");
		return mv;
	}
	
	@RequestMapping("InsertEmployee")

	public ModelAndView loadInsertEmployee() {
		ModelAndView mv = new ModelAndView("InsertEmployee");
		return mv;
	}
	
	@RequestMapping("PerformInsert")

	public ModelAndView performInsert(@ModelAttribute("bean") Employee bean) {
		dao.insertEmployee(bean);
		ModelAndView mv = new ModelAndView("InsertEmployeeSuccess");
		mv.addObject("bean", bean);
		return mv;
	}
	
	
}
