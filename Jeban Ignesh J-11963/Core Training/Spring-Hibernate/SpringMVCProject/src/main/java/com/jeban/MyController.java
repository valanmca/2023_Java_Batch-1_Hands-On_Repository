package com.jeban;

import java.net.http.HttpClient;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jeban.bean.Addition;
import com.jeban.bean.Employee;

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
		mv.addObject("fname", "Jeban");
		return mv;
	}

	@RequestMapping("Input")
	public ModelAndView callInput() {
		ModelAndView mv = new ModelAndView("Input");
//		mv.setViewName("Input");
		return mv;
	}

	@RequestMapping("Addition")
	public ModelAndView performAddition(@ModelAttribute("addition") Addition addition) {
		ModelAndView mv = new ModelAndView("Result");
//		int sum = addition.getN1() + addition.getN2();
		mv.addObject("bean", addition);
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
