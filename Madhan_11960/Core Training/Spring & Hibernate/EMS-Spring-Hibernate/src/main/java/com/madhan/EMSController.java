package com.madhan;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.madhan.bean.Employee;
import com.madhan.dao.EmployeeDAO;

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
	public ModelAndView loadInsertemployee() {
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

	@RequestMapping("UpdateEmployee")
	public ModelAndView loadUpdateEmployee() {
		ModelAndView mv = new ModelAndView("UpdateEmployee");
		return mv;
	}

	@RequestMapping("PerformUpdate")
	public ModelAndView performUpdate(@ModelAttribute("bean") Employee bean) {

		dao.updateEmployee(bean);
		ModelAndView mv = new ModelAndView("UpdateEmployeeSuccess");

		return mv;
	}

	@RequestMapping("DeleteEmployee")
	public ModelAndView loadDeleteEmployee() {
		List<Integer> list = dao.getIdList();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("DeleteEmployee");
		mv.addObject("idList", list);
		return mv;
	}

	@RequestMapping("PerformDelete")
	public ModelAndView performDelete(@ModelAttribute("bean") Employee bean) {

		dao.deleteEmployee(bean);

		ModelAndView mv = new ModelAndView();
		mv.setViewName("DeleteEmployeeSuccess");
		mv.addObject("bean", bean);

		return mv;
	}

	@RequestMapping("FindEmployee")
	public ModelAndView FindEmployee() {
		List<Integer> list = dao.getIdList();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("FindEmployee");
		mv.addObject("idList", list);
		return mv;
	}

	@RequestMapping("PerformFind")
	public ModelAndView performFind(@ModelAttribute("bean") Employee bean) {

		Employee emp = dao.findEmployee(bean);

		ModelAndView mv = new ModelAndView();
		mv.setViewName("FindEmployeeSuccess");
		mv.addObject("bean", emp);

		return mv;
	}

	@RequestMapping("FindAllEmployeeSuccess")
	public ModelAndView FindAllEmployee() {
		List<Integer> list = dao.getAllList();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("FindAllEmployeeSuccess");
		mv.addObject("idList", list);
		return mv;
	}

}
