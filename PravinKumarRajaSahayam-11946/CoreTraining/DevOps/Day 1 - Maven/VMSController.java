package com.vms;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.vms.bean.Car;
import com.vms.dao.CarDAO;
@Controller
public class VMSController {
	@Autowired
	CarDAO dao;

	@RequestMapping("Links")
	public ModelAndView loadLinks() {
		ModelAndView mv = new ModelAndView("Links");
		return mv;
	}

	@RequestMapping("Register")
	public ModelAndView loadRegister() {
		ModelAndView mv = new ModelAndView("Register");
		return mv;
	}

	@RequestMapping("Success")
	public ModelAndView loadSuccess() {
		ModelAndView mv = new ModelAndView("Success");
		return mv;
	}

	@RequestMapping("Fail")
	public ModelAndView loadFail() {
		ModelAndView mv = new ModelAndView("Fail");
		return mv;
	}
	
	@RequestMapping("PerformInsert")
	public ModelAndView performInsert(@ModelAttribute("bean") Car bean) {
try {
		dao.insertCar(bean);
		ModelAndView mv = new ModelAndView("Success");
		mv.addObject("bean", bean);
		return mv;
}catch(Exception e)
{
	ModelAndView mv = new ModelAndView("Fail");
	return mv;
}
	}

	}