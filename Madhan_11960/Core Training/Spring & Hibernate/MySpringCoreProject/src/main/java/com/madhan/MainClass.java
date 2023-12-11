package com.madhan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.beans.factory.BeanFactory;

public class MainClass {

	public static void main(String[] args) {
		
		// Tightly coupled Application(System)
		
//		Employee emp = new Employee(10,"Madhan",10000);
//		emp.display();
		
		
		//Loosely Coupled System
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		
//		Resource res=new ClassPathResource("Beans.xml");
//		BeanFactory factory = new BeanFactory(res);
		
		Employee bean=(Employee) context.getBean("employee");
		System.out.println(bean);
		
		Employee bean1=(Employee) context.getBean("employee1");
		System.out.println(bean1);
		
//		Address add=(Address) context.getBean("address");
//		System.out.println(add);
//		
//		Address add1=(Address) context.getBean("address1");
//		System.out.println(add1);

	}

}
