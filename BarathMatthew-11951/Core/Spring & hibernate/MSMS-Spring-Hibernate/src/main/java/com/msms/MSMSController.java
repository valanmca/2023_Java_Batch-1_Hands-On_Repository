package com.msms;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.msms.bean.Mobile;
import com.msms.dao.MobileDAO;

@Controller
public class MSMSController {
	
	@Autowired
	MobileDAO dao;
	
	@RequestMapping("Head")
	public ModelAndView loadHead() {
		ModelAndView mv=new ModelAndView("Head");
		return mv;
	}
	@RequestMapping("Links")
	public ModelAndView loadLinks() {
		ModelAndView mv=new ModelAndView("Links");
		return mv;
	}
	
	@RequestMapping("InsertMobile")
	public ModelAndView loadInsertMobile() {
		ModelAndView mv=new ModelAndView("InsertMobile");
		return mv;
	}
	
	@RequestMapping("PerformInsert")
	public ModelAndView perfromInsert(@ModelAttribute("bean") Mobile bean) {
		dao.insertMobile(bean);
		ModelAndView mv=new ModelAndView("InsertMobileSuccess");
		mv.addObject("bean",bean);
		return mv;
	}
	
	@RequestMapping("UpdateMobile")
	public ModelAndView loadUpdateMobile() {
		ModelAndView mv=new ModelAndView("UpdateMobile");
		return mv;
	}
	
	@RequestMapping("PerformUpdate")
	public ModelAndView perfromUpdate(@ModelAttribute("bean") Mobile bean) {
		dao.updateMobile(bean);
		ModelAndView mv=new ModelAndView("UpdateMobileSuccess");
		mv.addObject("bean",bean);
		return mv;
	}
	
	@RequestMapping("DeleteMobile")
	public ModelAndView loadDeleteMobile() {
		List<Integer> idList=dao.getIdList();
		ModelAndView mv=new ModelAndView("DeleteMobile");
		mv.addObject("idList",idList);
		return mv;
	}
	
	@RequestMapping("PerformDelete")
	public ModelAndView perfromDelete(@ModelAttribute("bean") Mobile bean) {
		dao.deleteMobile(bean);
		ModelAndView mv=new ModelAndView("DeleteMobileSuccess");
		mv.addObject("bean",bean);
		return mv;
	}
	
	@RequestMapping("FindMobile")
	public ModelAndView loadFindMobile() {
		List<Integer> idList=dao.getIdList();
		ModelAndView mv=new ModelAndView("FindMobile");
		mv.addObject("idList",idList);
		return mv;
	}
	
	@RequestMapping("PerformFind")
	public ModelAndView perfromFind(@ModelAttribute("bean") Mobile bean) {
		Mobile mob=dao.findMobile(bean);
		ModelAndView mv=new ModelAndView("FindMobileSuccess");
		mv.addObject("mob",mob);
		return mv;
	}
	
	@RequestMapping("FindAllMobile")
	public ModelAndView loadFindAllMobile() {
		List<Mobile> mList=dao.viewAllMobiles();
		ModelAndView mv=new ModelAndView("FindAllMobile");
		mv.addObject("mList",mList);
		return mv;
	}



}
