package com.mms;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mms.bean.Mobile;
import com.mms.dao.MobileDAO;

@Controller
public class MMSController {
	
	@Autowired
	MobileDAO dao;
	
	@RequestMapping("Home")
	public ModelAndView loadHome() {
		ModelAndView mv = new ModelAndView("Home");
		return mv;
	}
	
	@RequestMapping("Links")
	public ModelAndView loadLinks() {
		ModelAndView mv = new ModelAndView("Links");
		return mv;
	}
	
	@RequestMapping("InsertMobile")
	public ModelAndView loadInsertMobile() {
		ModelAndView mv = new ModelAndView("InsertMobile");
		return mv;
	}
	
	@RequestMapping("performInsert")
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
	
	@RequestMapping("UpdateMobile")
	public ModelAndView loadUpdateMobile() {
		ModelAndView mv = new ModelAndView("UpdateMobile");
		return mv;
	}
	
	@RequestMapping("performUpdate")
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
	
	@RequestMapping("DeleteMobile")
    public ModelAndView loadDeleteMobile() {
        List<Integer> list=dao.getIdList();
        ModelAndView mv=new ModelAndView("DeleteMobile");
        mv.addObject("idList",list);
        return mv;
    }
    
    @RequestMapping("performDelete")
    public ModelAndView perfromDelete(@ModelAttribute("bean") Mobile bean) {
        dao.deleteMobile(bean);
        ModelAndView mv=new ModelAndView("DeleteMobileSuccess");
        mv.addObject("bean",bean);
        return mv;
    }
    
    @RequestMapping("FindMobile")
    public ModelAndView loadFindMobile() {
        List<Integer> list=dao.getIdList();
        ModelAndView mv=new ModelAndView("FindMobile");
        mv.addObject("idList",list);
        return mv;
    }
    
    @RequestMapping("performFind")
    public ModelAndView perfromFind(@ModelAttribute("bean") Mobile bean) {
    	Mobile mob=dao.findMobile(bean);
        ModelAndView mv=new ModelAndView("FindMobileSuccess");
        mv.addObject("bean",mob);
        return mv;
    }
    
    @RequestMapping("FindAllMobile")
    public ModelAndView loadFindAllMobile() {
        List<Mobile> mobList=dao.getMobiles();
        ModelAndView mv=new ModelAndView("FindAllMobile");
        mv.addObject("idList",mobList);
        return mv;
    }
}
