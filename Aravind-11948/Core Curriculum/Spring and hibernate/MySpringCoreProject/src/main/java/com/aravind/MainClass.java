
package com.aravind;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainClass {

	public static void main(String[] args) {

		// Tightly coupled application

//		Employee emp =new Employee(101,"aravind",2000);
//		emp.display();

		// Loosely coupled
		// getting data from beans.xml and initializing obj to Application context

		// using Setter method injection

		// bean factory
		// Two ways to get data from bean.xml
		// 1)
		// Resource resource =new ClassPathResource("Bean.xml");
		//
		// BeanFactory factory=new XmlBeanFactory("resourse");

		
		// 2)
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		Employee emp = (Employee) context.getBean("employee");
	System.out.println(emp);

		System.out.println();

		// using constructor injection

//		Employee cons = (Employee) context.getBean("employee1");
//		cons.show();
//
//		System.out.println();

//		Employee emp1= (Employee)context.getBean("employee1");
//		System.out.println(emp);
//		Address Add2=(Address)context.getBean("employeeadd2");
//		System.out.println(Add2);
//		

	}

}
