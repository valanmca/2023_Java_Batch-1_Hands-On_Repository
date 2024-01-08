package com.ems.test;

import static org.junit.Assert.*;



import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.OrderWith;
import org.junit.runner.manipulation.Alphanumeric;

import com.ems.bean.Employee;
import com.ems.dao.EmployeeDAO;

@OrderWith(Alphanumeric.class)
public class EmployeeDAOTest {
    static EmployeeDAO dao;
    Employee emp;
    Employee emp1;
    Employee emp2;
    List<Employee> list;
    List<Employee> list1;
 
    @BeforeClass
    public static void objectCreation() {
        dao = new EmployeeDAO();
    }
    
    @AfterClass
    public static void reset() {
       dao = null;
    }
    
    @Before
    public void initialization() {
        emp = new Employee(1,"James",20000);
        list = new ArrayList<Employee>();
        list1 = new ArrayList<Employee>();
    }
    
    @After
    public void reset1() {
        emp = null;
    }
    
    @Test
    public void atestInsertEmployee() {
        assertEquals(1,dao.insertEmployee(emp));
    }
    
    @Test
    public void btestUpdateEmployee() {
        assertEquals(1,dao.updateEmployee(emp));
    }
    
    @Test
    public void dtestDeleteEmployee() {
        assertEquals(1,dao.deleteEmployee(1));
    }
    
    @Test
    public void ctestFindEmployee() {
        emp1 = dao.findEmployee(1);
        emp.equals(emp1);
    }
    
    
    @Test
    public void etestViewEmployee() {
        list = dao.findAllEmployee();
        emp2 = new Employee(101,"Sandy",45000);
        list1.add(emp2);
        list1.equals(list);
    }
        
}