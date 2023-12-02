package com.jenish;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jenish.bean.Addition;
import com.jenish.bean.Employee;

@Controller
public class MyController {

	@RequestMapping("Welcome")
	public ModelAndView sayWelcome() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Welcome"); // initization
		return mv; // forward
	}

	@RequestMapping("Hello")
	public ModelAndView sayHello() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Hello"); // initization
		mv.addObject("fname", "Jenish");
		return mv; // return indicates the forwarding the responses
	}

	@RequestMapping("Input")
	public ModelAndView sayInput() {
		ModelAndView mv = new ModelAndView("Input"); // anotherway
		// mv.setViewName("Input"); //initization - 1way
		return mv; // return indicates the forwarding the responses
	}

	@RequestMapping("Addition")
	public ModelAndView performAddition(@ModelAttribute("addition") Addition addition) {
		ModelAndView mv = new ModelAndView("Result");
		int sum = addition.getN1() + addition.getN2();
		mv.addObject("bean", addition);
		return mv; // return indicates the forwarding the responses
	}
	@RequestMapping("EmployeeInput")
	public ModelAndView callEmployeeInput() {
		ModelAndView mv = new ModelAndView("EmployeeInput");
		return mv;
		}
	@RequestMapping("AddEmployee")
	public ModelAndView addEmployee(@ModelAttribute("employee") Employee employee) {
		ModelAndView mv = new ModelAndView("EmployeeResult");
		mv.addObject("emp", employee);
		return mv;
		}

	/*@RequestMapping("Calculator")
	public ModelAndView sayCalculator() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Calculator"); // initization
		return mv; // return indicates the forwarding the responses
	}

	@RequestMapping("Addition")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
		int i = Integer.parseInt(request.getParameter("number1"));
		int j = Integer.parseInt(request.getParameter("number2"));
		int k = i + j;

		ModelAndView mv = new ModelAndView();
		mv.setViewName("Display");
		mv.addObject("result", k);
		return mv;
	}*/

}
