package com.swetha;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.swetha.bean.Addition;
import com.swetha.bean.Employee;

@Controller
public class MyController {

	
	// @RequestMapping -> to map requests to controllers methods. 
	
	@RequestMapping("Welcome")
	public ModelAndView sayWelcome() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("Welcome");
		return mv;
	}
	@RequestMapping("Hello")
	public ModelAndView sayHello() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("Hello");
		mv.addObject("fname","Swetha");
		return mv;
	}
	

	
	@RequestMapping("Input")
	public ModelAndView callINputPage() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("Input");
		return mv;
	}
	
	@RequestMapping("Addition")
	public ModelAndView performAddition(@ModelAttribute("addition")Addition addition) {
		ModelAndView mv=new ModelAndView("Result");
//		int sum=addition.getN1()+addition.getN2();
//		mv.addObject("sum",sum);
		
		//Directly sending bean obj to result page
		mv.addObject("bean",addition);
		return mv;
	}
	
	@RequestMapping("EmployeeInput")
	public ModelAndView callEmployeeINputPage() {
		ModelAndView mv=new ModelAndView("EmployeeInput"); //goes to EmployeeInput.jsp
		return mv;
	}
	
	@RequestMapping("AddEmployee") //creating bean object for Employee bean class
	public ModelAndView addEmployee(@ModelAttribute("employee") Employee employee) {
		ModelAndView mv=new ModelAndView("EmployeeResult");
		mv.addObject("emp",employee); //employee - bean object
		return mv;
	}
	
	
}
