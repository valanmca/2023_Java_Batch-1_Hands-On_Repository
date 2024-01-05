package com.sms.controller;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.sms.bean.Student;
import com.sms.dao.StudentDAO;

@RestController
public class SMSController {
	@Autowired
	StudentDAO dao;

	@RequestMapping("/Start")
	public ModelAndView loadLandingPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("LandingPage");
		return mv;
	}

	@RequestMapping("/Links")
	public ModelAndView loadLinksPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Links");
		return mv;
	}

	@RequestMapping("/InsertStudent")
	public ModelAndView loadInsertStudentPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("InsertStudent");
		return mv;
	}

	@RequestMapping("/PerformInsert")
	public ModelAndView performInsert(Student std) {
		ModelAndView mv = new ModelAndView();
		dao.save(std);
		mv.setViewName("InsertStudentSuccess");
		mv.addObject("bean", std);
		return mv;
	}

	@RequestMapping("/UpdateStudent")
	public ModelAndView loadUpdateStudentPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("UpdateStudent");
		return mv;
	}

	@RequestMapping("/PerformUpdate")
	public ModelAndView performUpdate(Student std) {
		ModelAndView mv = new ModelAndView();
		dao.save(std);
		mv.setViewName("UpdateStudentSuccess");
		mv.addObject("bean", std);
		return mv;
	}

	@RequestMapping("/DeleteStudent")
	public ModelAndView loadDeleteStudentPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("DeleteStudent");
		return mv;
	}

	@RequestMapping("/PerformDelete")
	public ModelAndView performDelete(Student std) {
		ModelAndView mv = new ModelAndView();
		dao.delete(std);
		mv.setViewName("DeleteStudentSuccess");
		mv.addObject("bean", std);
		return mv;
	}

	@RequestMapping("/FindStudent")
	public ModelAndView loadFindStudentPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("FindStudent");
		return mv;
	}

	@RequestMapping("/PerformFind")
	public ModelAndView performFind(int std_id) {
		ModelAndView mv = new ModelAndView();
		Student std = dao.findById(std_id).get();
		mv.setViewName("FindStudentSuccess");
		mv.addObject("bean", std);
		return mv;
	}
	
	@RequestMapping("FindAllStudent")
    public ModelAndView loadFindStudent() {
        Iterator<Student> it =  dao.findAll().iterator();
        
        String temp = "";
        while(it.hasNext()) {
            Student e = it.next();
            temp += "<tr><td>"+e.getStd_id()+"</td><td>"+e.getStd_name()+"</td><td>"+e.getStd_sec()+"</td></tr>";
        }
        ModelAndView mv=new ModelAndView();
        mv.addObject("temp",temp);
        mv.setViewName("FindAllStudent");
        return mv;
    }


}
