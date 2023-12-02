package com.dharshu;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dharshu.bean.Addition;
import com.dharshu.bean.Employee;

@Controller
public class MyController {
	
	
	@RequestMapping("Welcome") //identifying the actions like which hyperlink is clicking 
	public ModelAndView sayWelcome() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Welcome");
		return mv; //  return indicates the forwarding the response 
	}
	
	@RequestMapping("Hello")
	public ModelAndView sayHello() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Hello"); // return indicates the forwarding the response
		mv.addObject("fname","Dharshu");
		return mv;
	}
	
	@RequestMapping("Calculator")
	public ModelAndView sayCalculator() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Calculator"); // return indicates the forwarding the response
		return mv;
	}
	
	//Adding two numbers with the help of Servlet 
	 
	 
	 //Adding two number with the Spring MVC pattern 
	 @RequestMapping("Input")
		public ModelAndView callInputPage() {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("Input"); // return indicates the forwarding the response
			return mv;
		}
	
	 @RequestMapping("Addition")
		public ModelAndView performAddition(@ModelAttribute("addition") Addition addition) {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("Result"); 
			
			mv.addObject("bean",addition);
			return mv;
		}
	
	 //Employee Input 
	 @RequestMapping("EmployeeInput")
		public ModelAndView callEmployeeInputPage() {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("EmployeeInput"); // return indicates the forwarding the response
			return mv;
		}
	 
	 @RequestMapping("AddEmployee")
		public ModelAndView addEmployee(@ModelAttribute("employee") Employee employee) {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("EmployeeResult");
			mv.addObject("emp",employee);
			return mv;
		}

}
