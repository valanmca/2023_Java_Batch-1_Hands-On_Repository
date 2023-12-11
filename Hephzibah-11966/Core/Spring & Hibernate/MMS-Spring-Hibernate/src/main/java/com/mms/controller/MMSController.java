package com.mms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.mms.bean.Movie;

import com.mms.dao.MovieDAO;

@Controller
public class MMSController {
	
	@Autowired
    MovieDAO dao;
	
	@RequestMapping("Home")
	public ModelAndView loadHome() {
		ModelAndView mv = new ModelAndView("Home");
		return mv;
	}
	
	@RequestMapping("header")
	public ModelAndView loadheader() {
		ModelAndView mv = new ModelAndView("header");
		return mv;
	}
	@RequestMapping("Links")
	public ModelAndView loadLinks() {
		ModelAndView mv = new ModelAndView("Links");
		return mv;
	}
	
	@RequestMapping("InsertMovie")
	public ModelAndView loadInsertMovie() {
		ModelAndView mv = new ModelAndView("InsertMovie");
		return mv;
	}
	
	@RequestMapping("PerformInsert")
    public ModelAndView persormInsert(@ModelAttribute("bean") Movie bean)
    {
        ModelAndView mv=new ModelAndView();
        try {
            dao.insertMovie(bean);
            mv.setViewName("InsertMovieSuccess");
            
        }catch(Exception e)
        {
            mv.setViewName("InsertMovieFail");
            
        }
        return mv;
    }
	
	@RequestMapping("UpdateMovie")
	public ModelAndView loadUpdateMovie() {
		ModelAndView mv = new ModelAndView("UpdateMovie");
		return mv;
	}
	
	@RequestMapping("PerformUpdate")
	public ModelAndView performUpdate(@ModelAttribute("bean") Movie bean) {
		
		ModelAndView mv=new ModelAndView();
        try {
            dao.updateMovie(bean);
            mv.setViewName("UpdateMovieSuccess");
            
        }catch(Exception e)
        {
            mv.setViewName("UpdateMovieFail");
            
        }
        return mv;
	}
	
	@RequestMapping("DeleteMovie")
	public ModelAndView loadDeleteMovie() {
		List<Integer> list = dao.getIdList();
		ModelAndView mv = new ModelAndView("DeleteMovie");
		mv.addObject("idList",list);
		return mv;
	}
	
	@RequestMapping("PerformDelete")
	public ModelAndView performDelete(@ModelAttribute("bean") Movie bean) {
		
		dao.deleteMovie(bean);
		ModelAndView mv = new ModelAndView("DeleteMovieSuccess");
		mv.addObject("bean",bean);
		return mv;
	}
	
	@RequestMapping("FindMovie")
	public ModelAndView loadFindMovie() {
		List<Integer> list = dao.getIdList();
		ModelAndView mv = new ModelAndView("FindMovie");
		mv.addObject("idList",list);
		return mv;
	}
	
	@RequestMapping("PerformFind")
	public ModelAndView performFind(@ModelAttribute("bean") Movie bean) {
		
		Movie emp = dao.findMovie(bean);
		ModelAndView mv = new ModelAndView("FindMovieSuccess");
		mv.addObject("emp", emp);
		return mv;
	}
	
	@RequestMapping("FindAllMovieSuccess")
	public ModelAndView FindAllMovie() {
		List<Integer> list = dao.getAllList();
		ModelAndView mv = new ModelAndView("FindAllMovieSuccess");
		mv.addObject("idList",list);
		return mv;
	}

}
