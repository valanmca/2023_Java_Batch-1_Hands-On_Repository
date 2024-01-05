package com.domnic;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.domnic.bean.Addition;
import com.domnic.bean.Employee;

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
		mv.addObject("fname","Domnic");
		return mv;
	}
	

	@RequestMapping("Calculator")
	public ModelAndView calculator() {
		ModelAndView mv = new ModelAndView("Calculator");
		//mv.setViewName("Calculator");
		return mv;
	}
	
	@RequestMapping("Addition")
	public ModelAndView performAddition(@ModelAttribute("addition")Addition addition) {
		ModelAndView mv = new ModelAndView("Result");
		//int sum=addition.getNum1()+addition.getNum2();
		//mv.addObject("sum",sum);
		mv.addObject("bean",addition);
		return mv;
	}

	@RequestMapping("EmployeeInput")
	public ModelAndView callEmployeeInput() {
		ModelAndView mv = new ModelAndView("EmployeeInput");
		return mv;
	}

	@RequestMapping("AddEmployee")
	public ModelAndView addEmployee(@ModelAttribute("employee")Employee employee) {
		ModelAndView mv = new ModelAndView("EmployeeResult");
		mv.addObject("emp", employee);
		return mv;
	}
	
//	@RequestMapping("Logic")
//	public String display(HttpServletRequest req, Model m) {
//		int n1 = Integer.parseInt(req.getParameter("num1"));
//		int n2 = Integer.parseInt(req.getParameter("num2"));
//		int value = 0;
//		String Operation = req.getParameter("button");
//		if (Operation.equals("Addition")) {
//			 value = n1 + n2;
//		}
//		if (Operation.equals("Substraction")) {
//			 value = n1 - n2;
//
//		}
//		if (Operation.equals("Multiplication")) {
//			 value = n1 * n2;
//
//		}
//		if (Operation.equals("Division")) {
//			 value = n1 / n2;
//
//		}
//        m.addAttribute("msg",value);
//		return "Result";
//	}
}
