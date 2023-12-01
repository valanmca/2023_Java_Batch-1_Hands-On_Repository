package com.naveen;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.services.CalculatorService;

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
		return mv;
	}

	@RequestMapping("Calculator")
	public ModelAndView sayCalculator() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Calculator");
		return mv;
	}

	@PostMapping("Addition")
	public String performAddition(@ModelAttribute("numbers") CalculatorService numbers) {
		int result = numbers.getNumber1() + numbers.getNumber2();
		numbers.setResult(result);
		return "result";
		
	}
}
