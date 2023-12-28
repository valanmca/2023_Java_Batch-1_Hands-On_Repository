package com.jeban;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jeban.bean.Employee;
import com.jeban.dao.EmployeeDAO;

@Controller
public class EMScontroller {
	@Autowired
	EmployeeDAO dao;

	@RequestMapping("Links")
	public ModelAndView loadLinks() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Links");
		return mv;
	}

	@RequestMapping("InsertEmployee")
	public ModelAndView loadInsertEmployee() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("InsertEmployee");
		return mv;
	}

	@RequestMapping("PerformInsert")
	public ModelAndView performInsertEmployee(@ModelAttribute("bean") Employee bean) {
		dao.insertEmployee(bean);
		ModelAndView mv = new ModelAndView("InsertEmployeeSuccess");

		mv.addObject("bean", bean);
		return mv;
	}

	@RequestMapping("UpdateEmployee")
	public ModelAndView loadUpdateEmployee() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("UpdateEmployee");
		return mv;
	}

	@RequestMapping("PerformUpdate")
	public ModelAndView performUpdateEmployee(@ModelAttribute("bean") Employee bean) {
		dao.updateEmployee(bean);
		ModelAndView mv = new ModelAndView("UpdateEmployeeSuccess");

		mv.addObject("bean", bean);
		return mv;
	}

	@RequestMapping("DeleteEmployee")
	public ModelAndView loadDeleteEmployee() {

		List<Integer> list = dao.getIdList();
		ModelAndView mv = new ModelAndView("DeleteEmployee");
		mv.addObject("idList", list);
		return mv;
	}

	@RequestMapping("PerformDelete")
	public ModelAndView performDeleteEmployee(@ModelAttribute("bean") Employee bean) {
		dao.deleteEmployee(bean);
		ModelAndView mv = new ModelAndView("DeleteEmployeeSuccess");

		mv.addObject("bean", bean);
		return mv;
	}

	@RequestMapping("FindEmployee")
	public ModelAndView loadFindEmployee() {

		List<Integer> list = dao.getIdList();
		ModelAndView mv = new ModelAndView("FindEmployee");
		mv.addObject("idList", list);
		return mv;
	}

	@RequestMapping("PerformFind")
	public ModelAndView performFindEmployee(@ModelAttribute("bean") Employee bean) {
		Employee emp=dao.findEmployee(bean);
		ModelAndView mv = new ModelAndView("FindEmployeeSuccess");

		mv.addObject("bean", emp);
		return mv;
	}
	@RequestMapping("FindAllEmployee")
    public ModelAndView loadFindAllEmployee() {
        List<Employee> empList=dao.getEmployees();
        ModelAndView mv=new ModelAndView("FindAllEmployee");
        mv.addObject("idList",empList);
        return mv;
    }

}
