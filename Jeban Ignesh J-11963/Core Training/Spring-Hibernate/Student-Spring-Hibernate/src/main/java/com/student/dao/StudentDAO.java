package com.student.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


import com.student.bean.Student;
import com.student.util.DButil;

public class StudentDAO {
	Transaction transaction;
	Session session;

	public void insertStudent(Student bean) {
		session = DButil.getsession();
		transaction = session.beginTransaction();

		session.save(bean);
		transaction.commit();
		session.close();

	}

	public void updateStudent(Student bean) {
		session = DButil.getsession();
		transaction = session.beginTransaction();
		session.update(bean);
		transaction.commit();
		session.close();
	}

	public void deleteStudent(Student bean) {
		session = DButil.getsession();
		transaction = session.beginTransaction();
		session.delete(bean);
		transaction.commit();
		session.close();

	}
	public List<Integer> getIdList(){
		session=DButil.getsession();
		transaction=session.beginTransaction();
		
		Query query=session.createQuery("select rno from Student");
		
		List<Integer> list=query.list();
		transaction.commit();
		session.close();
		return list;
	}
	public Student findStudent(Student bean) {
		session=DButil.getsession();
		transaction=session.beginTransaction();
		
		Student stu=session.get(Student.class,bean.getRno());
		transaction.commit();
		session.close();
		return stu;
		
	}
	public List<Student> getStudents(){ 
        session=DButil.getsession();
         transaction=session.beginTransaction();
         Query query= session.createQuery("from Student"); 
         List<Student> empList=query.list();
         return empList;
        
    }

}
