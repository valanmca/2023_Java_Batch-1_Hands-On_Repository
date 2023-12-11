package com.sara.SpringWeb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping("Welcome")
	public ModelAndView sayWelcome() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Welcome");
		return mv;
	}

	@RequestMapping("Hello")
	public ModelAndView sayHello() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Hello");
		mv.addObject("fname", "Sara");
		return mv;
	}


	@RequestMapping("Input") 
	public ModelAndView callInputPage() { 
	ModelAndView mv = new ModelAndView(); 
	return mv; 
	}

	@RequestMapping("Addition") 
	public ModelAndView performAddtion(@ModelAttribute("addition") Addition addition) { 
	ModelAndView mv = new ModelAndView("Result"); 
	mv.addObject("bean",addition); 
	return mv; 
	}

	@RequestMapping("EmployeeInput")
	public ModelAndView callEmployeeInputPage() {
		ModelAndView mv = new ModelAndView("EmployeeInput");
		return mv;
	}

	@RequestMapping("AddEmployee")
	public ModelAndView addEmployee(@ModelAttribute("employee") Employee employee) {
		ModelAndView mv = new ModelAndView("EmployeeResult");
		mv.addObject("emp", employee);
		return mv;
	}

}
