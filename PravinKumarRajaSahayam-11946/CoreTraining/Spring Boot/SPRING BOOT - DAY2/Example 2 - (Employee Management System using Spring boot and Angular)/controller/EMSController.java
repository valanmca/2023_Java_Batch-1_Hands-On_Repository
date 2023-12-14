package com.ems.controller;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.aspectj.apache.bcel.Repository;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.ems.bean.Employee;
import com.ems.dao.EmployeeDAO;
@RestController
@CrossOrigin("*")
public class EMSController {
	@Autowired
	EmployeeDAO dao;
	
      /* @RequestMapping("/Start")
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
       }*/
       /*@RequestMapping("/InsertEmployee")
       public ModelAndView loadInsertEmployeePage()
       {
    	   ModelAndView mv= new ModelAndView();
    	   mv.setViewName("InsertEmployee");
    	   return mv;
       }*/
      /* @RequestMapping("/PerformInsert")
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

   	/*@RequestMapping("/PerformDelete")
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
       }*/
   
       /*@RequestMapping("/PerformDelete")
   	public ModelAndView performDelete(EmployeeService bean) {
   	ModelAndView mv = new ModelAndView("DeleteEmployeeSuccess");
   	dao.delete(bean);
   	mv.addObject("bean", bean);
   	return mv;
       }*/

	/*@RequestMapping("/FindEmployee")
	public ModelAndView loadFindEmployee() {
	    ModelAndView mv =new ModelAndView();
	    mv.setViewName("FindEmployee");
	    return mv;
	}

	@RequestMapping("/PerformFind")
	public ModelAndView performFind(Integer id) {
	    Employee emp = dao.findById(id).get();
	    ModelAndView mv =new ModelAndView("FindEmployeeSuccess");
	    mv.addObject("emp",emp);
	    return mv;
	}

	@RequestMapping("/FindAllEmployeeSuccess")
	public ModelAndView loadFindAllEmployeeSuccess() {
	    Iterator<Employee> it = dao.findAll().iterator();
	    String temp = "";
	    while(it.hasNext())
	    {
	    	Employee e = it.next();
	    	temp += "<tr><td>"+e.getId()+"</td><td>"+e.getName()+"</td><td>"+e.getDepartment()+"</td></tr>";
	    }
	    ModelAndView mv =new ModelAndView();
	    mv.addObject("temp",temp);
	    mv.setViewName("FindAllEmployeeSuccess");
	    return mv;
	}
	@RequestMapping("/FindEmployeeByName")
	public ModelAndView loadFindEmployeeByName(Employee emp) {
	    ModelAndView mv =new ModelAndView();
	    mv.setViewName("FindEmployeeByName");
	    return mv;
	}

	@RequestMapping("/PerformFindByName")
	public ModelAndView performFindByName(String name) {
	    Employee emp = dao.findByName(name);
	    ModelAndView mv =new ModelAndView("FindEmployeeSuccess");
	    mv.addObject("emp",emp);
	    return mv;
	}*/
	@PostMapping("/PerformInsert")
    public void performInsert(@RequestBody Employee emp)
    {
 	   dao.save(emp);
    }
	@PutMapping("/PerformUpdate")
    public void performUpdate(@RequestBody Employee emp)
    {
 	   dao.save(emp);
    }
	@DeleteMapping("/PerformDelete/{id}")
    public void performDelete(@PathVariable("id") int id)
    {
 	   dao.deleteById(id);
    }
	@GetMapping("/ViewAll")
    public List<Employee> getAllEmployee()
    {
 	   Iterator<Employee> it = dao.findAll().iterator();
 	   List<Employee> list = new ArrayList<Employee>();
 	   while(it.hasNext())
 	   {
 		   list.add(it.next());
 	   } 
 	   return list;
    }
}
