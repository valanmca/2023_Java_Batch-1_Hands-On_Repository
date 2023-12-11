package com.ems.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.ems.bean.Employee;
import com.ems.util.DBUtil;


public class EmployeeDAO {
    Transaction transaction;
    Session session;

    public void insertEmployee(Employee bean) {
        session = DBUtil.getSession();
        transaction = session.beginTransaction();

        session.save(bean);

        transaction.commit();
        session.close();

    }

    public void updateEmployee(Employee bean) {
        session = DBUtil.getSession();
        transaction = session.beginTransaction();

        session.update(bean);

        transaction.commit();
        session.close();

    }

    public void deleteEmployee(Employee bean) {
        session = DBUtil.getSession();
        transaction = session.beginTransaction();

        session.delete(bean);

        transaction.commit();
        session.close();

    }

    public List<Integer> getIdList() {
        session = DBUtil.getSession();
        transaction = session.beginTransaction();

        Query query = session.createQuery("select std_id from Student");
        List<Integer> list = query.list();

        transaction.commit();
        session.close();
        return list;

    }

//    public Employee findStudent(Employee bean) {
//        session = DBUtil.getSession();
//        transaction = session.beginTransaction();
//
//        Employee std = session.get(Employee.class, bean.getStd_id());
//        transaction.commit();
//        session.close();
//        return std;
//    }
//    
//    public List<Student> getStudent(){ 
//        session=DBUtil.getSession();
//         transaction=session.beginTransaction();
//         Query query= session.createQuery("from Student"); 
//         List<Student> List=query.list();
//         return List;
//        
//    }

}