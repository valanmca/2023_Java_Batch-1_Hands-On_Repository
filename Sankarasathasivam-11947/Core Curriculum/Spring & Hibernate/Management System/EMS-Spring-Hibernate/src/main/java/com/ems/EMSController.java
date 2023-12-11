package com.ems;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ems.bean.Employee;
import com.ems.dao.EmployeeDAO;


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
    public ModelAndView loadInsertEmployee() {
        ModelAndView mv = new ModelAndView("InsertEmployee");
        return mv;
    }

    @RequestMapping("performInsert")
    public ModelAndView PerformInsert(@ModelAttribute("bean") Employee bean) {
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
    public ModelAndView PerformUpdate(@ModelAttribute("bean") Employee bean) {
        dao.updateEmployee(bean);
        ModelAndView mv = new ModelAndView("UpdateEmployeeSuccess");
        mv.addObject("bean", bean);
        return mv;
    }
    
//    @RequestMapping("DeleteEmployee")
//    public ModelAndView loadDeleteEmployee() {
//        List<Integer>list=dao.getIdList();
//        
//        ModelAndView mv = new ModelAndView("DeleteStudent");
//        mv.addObject("idList",list);
//        return mv;
//    }
//
//    @RequestMapping("PerformDelete")
//    public ModelAndView PerformDelete(@ModelAttribute("bean") Student bean) {
//        dao.deleteStudent(bean);
//        ModelAndView mv = new ModelAndView("DeleteStudentSuccess");
//        mv.addObject("bean", bean);
//        return mv;
//    }
//    
//    @RequestMapping("FindStudent")
//    public ModelAndView loadFindStudent() {
//        List<Integer>list=dao.getIdList();
//        
//        ModelAndView mv = new ModelAndView("FindStudent");
//        mv.addObject("idList",list);
//        return mv;
//    }
//
//    @RequestMapping("PerformFind")
//    public ModelAndView PerformFind(@ModelAttribute("bean") Student bean) {
//        Student stu=dao.findStudent(bean);
//        ModelAndView mv = new ModelAndView("FindStudentSuccess");
//        mv.addObject("bean",stu);
//        return mv;
//    }
//    
//    @RequestMapping("FindAllStudent")
//    public ModelAndView loadFindAllStudent() {
//        List<Student> List=dao.getStudent();
//        ModelAndView mv=new ModelAndView("FindAllStudent");
//        mv.addObject("idList",List);
//        return mv;
//    }
}