package com.jeyandhan;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jeyandhan.bean.Addition;
import com.jeyandhan.employee.Employee;

@Controller
public class MyController {

	@RequestMapping("Welcome")
	public ModelAndView sayWelcome() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Welcome");
		mv.addObject("fname","Jeyandhan");
		return mv;
	}

	@RequestMapping("Hello")
	public ModelAndView sayHello() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Hello");
		mv.addObject("fname","Jeyandhan");
		return mv;
	}

	@RequestMapping("Calculator")
	public ModelAndView Calculator() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Calculator");
		return mv;
	}
	
	@RequestMapping("Input")
	public ModelAndView callInputPage() {
		ModelAndView mv = new ModelAndView("Input");
		return mv;
	}
	
	@RequestMapping("Addition")
	public ModelAndView performAddition(@ModelAttribute("addition") Addition addition) {
		ModelAndView mv = new ModelAndView("Result");
		//int sum = addition.getN1()+addition.getN2();
		//mv.addObject("sum",sum);
		
		mv.addObject("bean", addition);
		return mv;
	}
	
	@RequestMapping("EmployeeInput")
	public ModelAndView callEmployeeInput() {
		ModelAndView mv = new ModelAndView("EmployeeInput");
		return mv;
	}
	
	@RequestMapping("AddEmployee")
	public ModelAndView addEmployee(@ModelAttribute("employee") Employee employee ) {
		ModelAndView mv = new ModelAndView("EmployeeResult");
		mv.addObject("emp", employee);
		return mv;
	}
	

	@RequestMapping("Cal")
	public String display(HttpServletRequest req, Model m) {

		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));
		int value = 0;

		String operation = req.getParameter("button");
		
		if (operation.equals("Addition")) {
			value = a + b;
		}
		if (operation.equals("Subtraction")) {
			value = a - b;
		}
		m.addAttribute("msg", value);
		return "Result";
	}

}
