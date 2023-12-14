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

	@RequestMapping("header")
	public ModelAndView loadheader() {
		ModelAndView mv = new ModelAndView("header");
		return mv;
	}

	@RequestMapping("left")
	public ModelAndView loadleft() {
		ModelAndView mv = new ModelAndView("left");
		return mv;
	}

	@RequestMapping("right")
	public ModelAndView loadright() {
		ModelAndView mv = new ModelAndView("right");
		return mv;
	}

	@RequestMapping("InsertMobile")
	public ModelAndView loadInsertMobile() {
		ModelAndView mv = new ModelAndView("InsertMobile");
		return mv;
	}

	@RequestMapping("PerformInsert")
	public ModelAndView performInsert(@ModelAttribute("bean") Mobile bean) {
		ModelAndView mv = new ModelAndView();
		try {
			dao.insertMobile(bean);
			mv.setViewName("InsertMobileSuccess");
		} catch (Exception e) {
			mv.setViewName("InsertMobileFail");
		}
		return mv;
	}
	
	@RequestMapping("DeleteMobile")
	public ModelAndView loadDeleteMobile() {
		List<Integer> list = dao.getIdList();
		ModelAndView mv = new ModelAndView("DeleteMobile");
		mv.addObject("idList", list);
		return mv;
	}

	@RequestMapping("PerformDelete")
	public ModelAndView performDelete(@ModelAttribute("bean") Mobile bean) {

		dao.deleteMobile(bean);

		ModelAndView mv = new ModelAndView("DeleteMobileSuccess");
		mv.addObject("bean", bean);
		return mv;
	}

	
	@RequestMapping("UpdateMobile")
	public ModelAndView loadUpdateMobile() {
		ModelAndView mv = new ModelAndView("UpdateMobile");
		return mv;
	}

	@RequestMapping("PerformUpdate")
	public ModelAndView performUpdate(@ModelAttribute("bean") Mobile bean) {
		ModelAndView mv = new ModelAndView();
		try {
			dao.updateMobile(bean);
			mv.setViewName("UpdateMobileSuccess");
		} catch (Exception e) {
			mv.setViewName("UpdateMobileFail");
		}
		return mv;
	}

	@RequestMapping("FindMobile")
	public ModelAndView loadFindMobile() {
		List<Integer> list = dao.getIdList();
		ModelAndView mv = new ModelAndView("FindMobile");
		mv.addObject("idList", list);
		return mv;
	}

	@RequestMapping("PerformFind")
	public ModelAndView performFind(@ModelAttribute("bean") Mobile bean) {

		Mobile mob = dao.findMobile(bean);

		ModelAndView mv = new ModelAndView("FindMobileSuccess");
		mv.addObject("mob", mob);
		return mv;
	}

	@RequestMapping("FindAllMobile")
	public ModelAndView loadFindAllMobile() {
		List<Mobile> mobList = dao.getMobile();
		ModelAndView mv = new ModelAndView("FindAllMobile");
		mv.addObject("idList", mobList);
		return mv;
	}


}
