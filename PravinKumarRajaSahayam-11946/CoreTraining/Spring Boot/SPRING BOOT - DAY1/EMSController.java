package com.ems.controller;
import java.util.ArrayList;
import java.util.List;

import org.aspectj.apache.bcel.Repository;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.ems.bean.Employee;
import com.ems.dao.EmployeeDAO;
@Controller
public class EMSController {
	@Autowired
	EmployeeDAO dao;
	
       @RequestMapping("/Start")
       public ModelAndView loadLandingPage()
       {
    	   ModelAndView mv= new ModelAndView();
    	   mv.setViewName("LandingPage");
    	   return mv;
       }
       @RequestMapping("/Links")
       public ModelAndView loadLinksPage()
       {
    	   ModelAndView mv= new ModelAndView();
    	   mv.setViewName("Links");
    	   return mv;
       }
       @RequestMapping("/InsertEmployee")
       public ModelAndView loadInsertEmployeePage()
       {
    	   ModelAndView mv= new ModelAndView();
    	   mv.setViewName("InsertEmployee");
    	   return mv;
       }
       @RequestMapping("/PerformInsert")
       public ModelAndView performInsert(Employee emp)
       {
    	   ModelAndView mv= new ModelAndView();
    	   dao.save(emp);
    	   mv.setViewName("InsertEmployeeSuccess");
    	   mv.addObject("bean",emp);
    	   return mv;
       }
       @RequestMapping("/UpdateEmployee")
       public ModelAndView loadUpdateEmployeePage()
       {
    	   ModelAndView mv= new ModelAndView();
    	   mv.setViewName("UpdateEmployee");
    	   return mv;
       }
       @RequestMapping("/PerformUpdate")
   	public ModelAndView performUpdate(Employee bean) {
   	ModelAndView mv = new ModelAndView("UpdateEmployeeSuccess");
   	dao.save(bean);
   	mv.addObject("bean", bean);
   	return mv;
       }
       
      
       /*@RequestMapping("/DeleteEmployee")
   	public ModelAndView loadDeleteEmployeePage() {
   	    List<Employee> list = EmployeeService.getIdList();
        ModelAndView mv =new ModelAndView("DeleteEmployee");
   	    mv.addObject("idList",list);
   	    
   	    return mv;
   	}*/

   	@RequestMapping("/PerformDelete")
   	public ModelAndView performDelete(Employee bean) {
   	    ModelAndView mv =new ModelAndView("DeleteEmployeeSuccess");
   	    dao.delete(bean);
   	    mv.addObject("bean", bean);
   	    return mv;
   	}
   	
    @RequestMapping("/DeleteEmployee")
       public ModelAndView loadDeleteEmployeePage()
       {
    	   ModelAndView mv= new ModelAndView();
    	   mv.setViewName("DeleteEmployee");
    	   return mv;
       }
   
       /*@RequestMapping("/PerformDelete")
   	public ModelAndView performDelete(EmployeeService bean) {
   	ModelAndView mv = new ModelAndView("DeleteEmployeeSuccess");
   	dao.delete(bean);
   	mv.addObject("bean", bean);
   	return mv;
       }*/
 
}
